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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.globalaccelerator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomRoutingAccelerator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRoutingAcceleratorJsonUnmarshaller implements Unmarshaller<CustomRoutingAccelerator, JsonUnmarshallerContext> {

    public CustomRoutingAccelerator unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomRoutingAccelerator customRoutingAccelerator = new CustomRoutingAccelerator();

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
                if (context.testExpression("AcceleratorArn", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setAcceleratorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddressType", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IpSets", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setIpSets(new ListUnmarshaller<IpSet>(IpSetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    customRoutingAccelerator.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customRoutingAccelerator;
    }

    private static CustomRoutingAcceleratorJsonUnmarshaller instance;

    public static CustomRoutingAcceleratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomRoutingAcceleratorJsonUnmarshaller();
        return instance;
    }
}
