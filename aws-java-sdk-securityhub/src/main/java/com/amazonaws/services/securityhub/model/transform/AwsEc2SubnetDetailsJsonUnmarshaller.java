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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2SubnetDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SubnetDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2SubnetDetails, JsonUnmarshallerContext> {

    public AwsEc2SubnetDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2SubnetDetails awsEc2SubnetDetails = new AwsEc2SubnetDetails();

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
                if (context.testExpression("AssignIpv6AddressOnCreation", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setAssignIpv6AddressOnCreation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZoneId", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailableIpAddressCount", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setAvailableIpAddressCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultForAz", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setDefaultForAz(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MapPublicIpOnLaunch", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setMapPublicIpOnLaunch(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetArn", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setSubnetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ipv6CidrBlockAssociationSet", targetDepth)) {
                    context.nextToken();
                    awsEc2SubnetDetails.setIpv6CidrBlockAssociationSet(new ListUnmarshaller<Ipv6CidrBlockAssociation>(Ipv6CidrBlockAssociationJsonUnmarshaller
                            .getInstance())

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

        return awsEc2SubnetDetails;
    }

    private static AwsEc2SubnetDetailsJsonUnmarshaller instance;

    public static AwsEc2SubnetDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SubnetDetailsJsonUnmarshaller();
        return instance;
    }
}
