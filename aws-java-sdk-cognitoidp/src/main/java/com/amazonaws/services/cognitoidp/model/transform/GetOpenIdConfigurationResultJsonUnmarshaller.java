/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetOpenIdConfigurationResult JSON Unmarshaller
 */
public class GetOpenIdConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetOpenIdConfigurationResult, JsonUnmarshallerContext> {

    public GetOpenIdConfigurationResult unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        GetOpenIdConfigurationResult getOpenIdConfigurationResult = new GetOpenIdConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("issuer", targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult.setIssuer(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jwks_uri", targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult.setJwks_uri(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorization_endpoint",
                        targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult
                            .setAuthorization_endpoint(context.getUnmarshaller(
                                    String.class).unmarshall(context));
                }
                if (context.testExpression("subject_types_supported",
                        targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult
                            .setSubject_types_supported(new ListUnmarshaller<String>(
                                    context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("response_types_supported",
                        targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult
                            .setResponse_types_supported(new ListUnmarshaller<String>(
                                    context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression(
                        "id_token_signing_alg_values_supported", targetDepth)) {
                    context.nextToken();
                    getOpenIdConfigurationResult
                            .setId_token_signing_alg_values_supported(new ListUnmarshaller<String>(
                                    context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getOpenIdConfigurationResult;
    }

    private static GetOpenIdConfigurationResultJsonUnmarshaller instance;

    public static GetOpenIdConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOpenIdConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
