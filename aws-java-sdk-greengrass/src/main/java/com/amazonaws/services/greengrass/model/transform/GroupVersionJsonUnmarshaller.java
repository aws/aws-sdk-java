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
package com.amazonaws.services.greengrass.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GroupVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupVersionJsonUnmarshaller implements Unmarshaller<GroupVersion, JsonUnmarshallerContext> {

    public GroupVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        GroupVersion groupVersion = new GroupVersion();

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
                if (context.testExpression("ConnectorDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setConnectorDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setCoreDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setDeviceDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setFunctionDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggerDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setLoggerDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setResourceDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionDefinitionVersionArn", targetDepth)) {
                    context.nextToken();
                    groupVersion.setSubscriptionDefinitionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return groupVersion;
    }

    private static GroupVersionJsonUnmarshaller instance;

    public static GroupVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GroupVersionJsonUnmarshaller();
        return instance;
    }
}
