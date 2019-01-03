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
package com.amazonaws.services.signer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSigningPlatformResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSigningPlatformResultJsonUnmarshaller implements Unmarshaller<GetSigningPlatformResult, JsonUnmarshallerContext> {

    public GetSigningPlatformResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSigningPlatformResult getSigningPlatformResult = new GetSigningPlatformResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSigningPlatformResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("platformId", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setPlatformId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("partner", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setPartner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signingConfiguration", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setSigningConfiguration(SigningConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("signingImageFormat", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setSigningImageFormat(SigningImageFormatJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxSizeInMB", targetDepth)) {
                    context.nextToken();
                    getSigningPlatformResult.setMaxSizeInMB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSigningPlatformResult;
    }

    private static GetSigningPlatformResultJsonUnmarshaller instance;

    public static GetSigningPlatformResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSigningPlatformResultJsonUnmarshaller();
        return instance;
    }
}
