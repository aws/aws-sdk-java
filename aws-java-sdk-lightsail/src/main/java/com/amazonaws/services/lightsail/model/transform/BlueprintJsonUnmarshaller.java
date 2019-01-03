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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Blueprint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueprintJsonUnmarshaller implements Unmarshaller<Blueprint, JsonUnmarshallerContext> {

    public Blueprint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Blueprint blueprint = new Blueprint();

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
                if (context.testExpression("blueprintId", targetDepth)) {
                    context.nextToken();
                    blueprint.setBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    blueprint.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("group", targetDepth)) {
                    context.nextToken();
                    blueprint.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    blueprint.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    blueprint.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isActive", targetDepth)) {
                    context.nextToken();
                    blueprint.setIsActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("minPower", targetDepth)) {
                    context.nextToken();
                    blueprint.setMinPower(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    blueprint.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionCode", targetDepth)) {
                    context.nextToken();
                    blueprint.setVersionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("productUrl", targetDepth)) {
                    context.nextToken();
                    blueprint.setProductUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseUrl", targetDepth)) {
                    context.nextToken();
                    blueprint.setLicenseUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    blueprint.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return blueprint;
    }

    private static BlueprintJsonUnmarshaller instance;

    public static BlueprintJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintJsonUnmarshaller();
        return instance;
    }
}
