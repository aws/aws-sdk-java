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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IosImportClientBrandingAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IosImportClientBrandingAttributesJsonUnmarshaller implements Unmarshaller<IosImportClientBrandingAttributes, JsonUnmarshallerContext> {

    public IosImportClientBrandingAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        IosImportClientBrandingAttributes iosImportClientBrandingAttributes = new IosImportClientBrandingAttributes();

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
                if (context.testExpression("Logo", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setLogo(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("Logo2x", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setLogo2x(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("Logo3x", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setLogo3x(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("SupportEmail", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setSupportEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportLink", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setSupportLink(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForgotPasswordLink", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setForgotPasswordLink(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoginMessage", targetDepth)) {
                    context.nextToken();
                    iosImportClientBrandingAttributes.setLoginMessage(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return iosImportClientBrandingAttributes;
    }

    private static IosImportClientBrandingAttributesJsonUnmarshaller instance;

    public static IosImportClientBrandingAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IosImportClientBrandingAttributesJsonUnmarshaller();
        return instance;
    }
}
