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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails awsEc2LaunchTemplateDataNetworkInterfaceSetDetails = new AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails();

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
                if (context.testExpression("AssociateCarrierIpAddress", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setAssociateCarrierIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AssociatePublicIpAddress", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setAssociatePublicIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DeleteOnTermination", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setDeleteOnTermination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceIndex", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setDeviceIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Groups", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InterfaceType", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setInterfaceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ipv4PrefixCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setIpv4PrefixCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Ipv4Prefixes", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails
                            .setIpv4Prefixes(new ListUnmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails>(
                                    AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Ipv6AddressCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setIpv6AddressCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Ipv6Addresses", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails
                            .setIpv6Addresses(new ListUnmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails>(
                                    AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Ipv6PrefixCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setIpv6PrefixCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Ipv6Prefixes", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails
                            .setIpv6Prefixes(new ListUnmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails>(
                                    AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("NetworkCardIndex", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setNetworkCardIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIpAddresses", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails
                            .setPrivateIpAddresses(new ListUnmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails>(
                                    AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("SecondaryPrivateIpAddressCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setSecondaryPrivateIpAddressCount(context.getUnmarshaller(Integer.class).unmarshall(
                            context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataNetworkInterfaceSetDetails;
    }

    private static AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsJsonUnmarshaller();
        return instance;
    }
}
