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
 * Instance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    instance.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    instance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    instance.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    instance.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    instance.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    instance.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    instance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("blueprintId", targetDepth)) {
                    context.nextToken();
                    instance.setBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blueprintName", targetDepth)) {
                    context.nextToken();
                    instance.setBlueprintName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bundleId", targetDepth)) {
                    context.nextToken();
                    instance.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isStaticIp", targetDepth)) {
                    context.nextToken();
                    instance.setIsStaticIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    context.nextToken();
                    instance.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicIpAddress", targetDepth)) {
                    context.nextToken();
                    instance.setPublicIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipv6Address", targetDepth)) {
                    context.nextToken();
                    instance.setIpv6Address(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hardware", targetDepth)) {
                    context.nextToken();
                    instance.setHardware(InstanceHardwareJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networking", targetDepth)) {
                    context.nextToken();
                    instance.setNetworking(InstanceNetworkingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    instance.setState(InstanceStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("username", targetDepth)) {
                    context.nextToken();
                    instance.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sshKeyName", targetDepth)) {
                    context.nextToken();
                    instance.setSshKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
