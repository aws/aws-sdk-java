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
 * DestinationPortMapping JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationPortMappingJsonUnmarshaller implements Unmarshaller<DestinationPortMapping, JsonUnmarshallerContext> {

    public DestinationPortMapping unmarshall(JsonUnmarshallerContext context) throws Exception {
        DestinationPortMapping destinationPortMapping = new DestinationPortMapping();

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
                    destinationPortMapping.setAcceleratorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AcceleratorSocketAddresses", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setAcceleratorSocketAddresses(new ListUnmarshaller<SocketAddress>(SocketAddressJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EndpointGroupArn", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setEndpointGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointId", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointGroupRegion", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setEndpointGroupRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationSocketAddress", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setDestinationSocketAddress(SocketAddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IpAddressType", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationTrafficState", targetDepth)) {
                    context.nextToken();
                    destinationPortMapping.setDestinationTrafficState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return destinationPortMapping;
    }

    private static DestinationPortMappingJsonUnmarshaller instance;

    public static DestinationPortMappingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DestinationPortMappingJsonUnmarshaller();
        return instance;
    }
}
