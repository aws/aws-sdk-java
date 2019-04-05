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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkInterface JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterfaceJsonUnmarshaller implements Unmarshaller<NetworkInterface, JsonUnmarshallerContext> {

    public NetworkInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkInterface networkInterface = new NetworkInterface();

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
                if (context.testExpression("ipv6Addresses", targetDepth)) {
                    context.nextToken();
                    networkInterface.setIpv6Addresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    context.nextToken();
                    networkInterface.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privateDnsName", targetDepth)) {
                    context.nextToken();
                    networkInterface.setPrivateDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    context.nextToken();
                    networkInterface.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privateIpAddresses", targetDepth)) {
                    context.nextToken();
                    networkInterface.setPrivateIpAddresses(new ListUnmarshaller<PrivateIpAddressDetails>(PrivateIpAddressDetailsJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("publicDnsName", targetDepth)) {
                    context.nextToken();
                    networkInterface.setPublicDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicIp", targetDepth)) {
                    context.nextToken();
                    networkInterface.setPublicIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    context.nextToken();
                    networkInterface.setSecurityGroups(new ListUnmarshaller<SecurityGroup>(SecurityGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    context.nextToken();
                    networkInterface.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    networkInterface.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkInterface;
    }

    private static NetworkInterfaceJsonUnmarshaller instance;

    public static NetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
