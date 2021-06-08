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
 * AwsElbLoadBalancerDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerDetailsJsonUnmarshaller implements Unmarshaller<AwsElbLoadBalancerDetails, JsonUnmarshallerContext> {

    public AwsElbLoadBalancerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElbLoadBalancerDetails awsElbLoadBalancerDetails = new AwsElbLoadBalancerDetails();

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
                    awsElbLoadBalancerDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BackendServerDescriptions", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setBackendServerDescriptions(new ListUnmarshaller<AwsElbLoadBalancerBackendServerDescription>(
                            AwsElbLoadBalancerBackendServerDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CanonicalHostedZoneName", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCanonicalHostedZoneName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CanonicalHostedZoneNameID", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCanonicalHostedZoneNameID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setHealthCheck(AwsElbLoadBalancerHealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Instances", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setInstances(new ListUnmarshaller<AwsElbLoadBalancerInstance>(AwsElbLoadBalancerInstanceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ListenerDescriptions", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setListenerDescriptions(new ListUnmarshaller<AwsElbLoadBalancerListenerDescription>(
                            AwsElbLoadBalancerListenerDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LoadBalancerAttributes", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setLoadBalancerAttributes(AwsElbLoadBalancerAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setLoadBalancerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Policies", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setPolicies(AwsElbLoadBalancerPoliciesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Scheme", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setScheme(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceSecurityGroup", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSourceSecurityGroup(AwsElbLoadBalancerSourceSecurityGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Subnets", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsElbLoadBalancerDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsElbLoadBalancerDetails;
    }

    private static AwsElbLoadBalancerDetailsJsonUnmarshaller instance;

    public static AwsElbLoadBalancerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElbLoadBalancerDetailsJsonUnmarshaller();
        return instance;
    }
}
