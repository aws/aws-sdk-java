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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PhysicalNetworkInterface JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalNetworkInterfaceJsonUnmarshaller implements Unmarshaller<PhysicalNetworkInterface, JsonUnmarshallerContext> {

    public PhysicalNetworkInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        PhysicalNetworkInterface physicalNetworkInterface = new PhysicalNetworkInterface();

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
                if (context.testExpression("defaultGateway", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setDefaultGateway(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAddress", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAddressAssignment", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setIpAddressAssignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macAddress", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("netmask", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setNetmask(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("physicalConnectorType", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setPhysicalConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("physicalNetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    physicalNetworkInterface.setPhysicalNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return physicalNetworkInterface;
    }

    private static PhysicalNetworkInterfaceJsonUnmarshaller instance;

    public static PhysicalNetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhysicalNetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
