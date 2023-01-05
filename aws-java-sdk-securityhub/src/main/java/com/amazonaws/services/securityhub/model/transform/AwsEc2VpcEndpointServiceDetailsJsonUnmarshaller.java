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
 * AwsEc2VpcEndpointServiceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcEndpointServiceDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2VpcEndpointServiceDetails, JsonUnmarshallerContext> {

    public AwsEc2VpcEndpointServiceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VpcEndpointServiceDetails awsEc2VpcEndpointServiceDetails = new AwsEc2VpcEndpointServiceDetails();

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
                if (context.testExpression("AcceptanceRequired", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setAcceptanceRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BaseEndpointDnsNames", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setBaseEndpointDnsNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ManagesVpcEndpoints", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setManagesVpcEndpoints(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GatewayLoadBalancerArns", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setGatewayLoadBalancerArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkLoadBalancerArns", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setNetworkLoadBalancerArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PrivateDnsName", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setPrivateDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceState", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setServiceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceType", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcEndpointServiceDetails.setServiceType(new ListUnmarshaller<AwsEc2VpcEndpointServiceServiceTypeDetails>(
                            AwsEc2VpcEndpointServiceServiceTypeDetailsJsonUnmarshaller.getInstance())

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

        return awsEc2VpcEndpointServiceDetails;
    }

    private static AwsEc2VpcEndpointServiceDetailsJsonUnmarshaller instance;

    public static AwsEc2VpcEndpointServiceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VpcEndpointServiceDetailsJsonUnmarshaller();
        return instance;
    }
}
