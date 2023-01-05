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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RouterType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouterTypeJsonUnmarshaller implements Unmarshaller<RouterType, JsonUnmarshallerContext> {

    public RouterType unmarshall(JsonUnmarshallerContext context) throws Exception {
        RouterType routerType = new RouterType();

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
                if (context.testExpression("vendor", targetDepth)) {
                    context.nextToken();
                    routerType.setVendor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    routerType.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("software", targetDepth)) {
                    context.nextToken();
                    routerType.setSoftware(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xsltTemplateName", targetDepth)) {
                    context.nextToken();
                    routerType.setXsltTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xsltTemplateNameForMacSec", targetDepth)) {
                    context.nextToken();
                    routerType.setXsltTemplateNameForMacSec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routerTypeIdentifier", targetDepth)) {
                    context.nextToken();
                    routerType.setRouterTypeIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return routerType;
    }

    private static RouterTypeJsonUnmarshaller instance;

    public static RouterTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouterTypeJsonUnmarshaller();
        return instance;
    }
}
