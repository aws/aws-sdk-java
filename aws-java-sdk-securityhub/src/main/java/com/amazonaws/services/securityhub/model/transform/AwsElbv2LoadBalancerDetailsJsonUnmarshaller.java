/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsElbv2LoadBalancerDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbv2LoadBalancerDetailsJsonUnmarshaller implements Unmarshaller<AwsElbv2LoadBalancerDetails, JsonUnmarshallerContext> {

    public AwsElbv2LoadBalancerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElbv2LoadBalancerDetails awsElbv2LoadBalancerDetails = new AwsElbv2LoadBalancerDetails();

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
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setAvailabilityZones(new ListUnmarshaller<AvailabilityZone>(AvailabilityZoneJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CanonicalHostedZoneId", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setCanonicalHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DNSName", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setDNSName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddressType", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Scheme", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setScheme(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setState(LoadBalancerStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsElbv2LoadBalancerDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsElbv2LoadBalancerDetails;
    }

    private static AwsElbv2LoadBalancerDetailsJsonUnmarshaller instance;

    public static AwsElbv2LoadBalancerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElbv2LoadBalancerDetailsJsonUnmarshaller();
        return instance;
    }
}
