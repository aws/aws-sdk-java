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
package com.amazonaws.services.ecrpublic.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecrpublic.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Registry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryJsonUnmarshaller implements Unmarshaller<Registry, JsonUnmarshallerContext> {

    public Registry unmarshall(JsonUnmarshallerContext context) throws Exception {
        Registry registry = new Registry();

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
                if (context.testExpression("registryId", targetDepth)) {
                    context.nextToken();
                    registry.setRegistryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registryArn", targetDepth)) {
                    context.nextToken();
                    registry.setRegistryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registryUri", targetDepth)) {
                    context.nextToken();
                    registry.setRegistryUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("verified", targetDepth)) {
                    context.nextToken();
                    registry.setVerified(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("aliases", targetDepth)) {
                    context.nextToken();
                    registry.setAliases(new ListUnmarshaller<RegistryAlias>(RegistryAliasJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registry;
    }

    private static RegistryJsonUnmarshaller instance;

    public static RegistryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegistryJsonUnmarshaller();
        return instance;
    }
}
