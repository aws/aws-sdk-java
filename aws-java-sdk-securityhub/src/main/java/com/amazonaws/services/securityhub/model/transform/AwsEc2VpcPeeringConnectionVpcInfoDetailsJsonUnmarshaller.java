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
 * AwsEc2VpcPeeringConnectionVpcInfoDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2VpcPeeringConnectionVpcInfoDetails, JsonUnmarshallerContext> {

    public AwsEc2VpcPeeringConnectionVpcInfoDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VpcPeeringConnectionVpcInfoDetails awsEc2VpcPeeringConnectionVpcInfoDetails = new AwsEc2VpcPeeringConnectionVpcInfoDetails();

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
                if (context.testExpression("CidrBlock", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CidrBlockSet", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setCidrBlockSet(new ListUnmarshaller<VpcInfoCidrBlockSetDetails>(
                            VpcInfoCidrBlockSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Ipv6CidrBlockSet", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setIpv6CidrBlockSet(new ListUnmarshaller<VpcInfoIpv6CidrBlockSetDetails>(
                            VpcInfoIpv6CidrBlockSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeeringOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setPeeringOptions(VpcInfoPeeringOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionVpcInfoDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2VpcPeeringConnectionVpcInfoDetails;
    }

    private static AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller instance;

    public static AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller();
        return instance;
    }
}
