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
 * AwsEc2EipDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2EipDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2EipDetails, JsonUnmarshallerContext> {

    public AwsEc2EipDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2EipDetails awsEc2EipDetails = new AwsEc2EipDetails();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicIp", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setPublicIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocationId", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setAllocationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationId", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicIpv4Pool", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setPublicIpv4Pool(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkBorderGroup", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setNetworkBorderGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceOwnerId", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setNetworkInterfaceOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    context.nextToken();
                    awsEc2EipDetails.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2EipDetails;
    }

    private static AwsEc2EipDetailsJsonUnmarshaller instance;

    public static AwsEc2EipDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2EipDetailsJsonUnmarshaller();
        return instance;
    }
}
