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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActiveDirectoryConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveDirectoryConfigurationJsonUnmarshaller implements Unmarshaller<ActiveDirectoryConfiguration, JsonUnmarshallerContext> {

    public ActiveDirectoryConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActiveDirectoryConfiguration activeDirectoryConfiguration = new ActiveDirectoryConfiguration();

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
                if (context.testExpression("computerAttributes", targetDepth)) {
                    context.nextToken();
                    activeDirectoryConfiguration.setComputerAttributes(new ListUnmarshaller<ActiveDirectoryComputerAttribute>(
                            ActiveDirectoryComputerAttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("directoryId", targetDepth)) {
                    context.nextToken();
                    activeDirectoryConfiguration.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("organizationalUnitDistinguishedName", targetDepth)) {
                    context.nextToken();
                    activeDirectoryConfiguration.setOrganizationalUnitDistinguishedName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activeDirectoryConfiguration;
    }

    private static ActiveDirectoryConfigurationJsonUnmarshaller instance;

    public static ActiveDirectoryConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActiveDirectoryConfigurationJsonUnmarshaller();
        return instance;
    }
}
