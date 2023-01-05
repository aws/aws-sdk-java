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
 * AwsRdsDbSecurityGroupDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSecurityGroupDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbSecurityGroupDetails, JsonUnmarshallerContext> {

    public AwsRdsDbSecurityGroupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbSecurityGroupDetails awsRdsDbSecurityGroupDetails = new AwsRdsDbSecurityGroupDetails();

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
                if (context.testExpression("DbSecurityGroupArn", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setDbSecurityGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSecurityGroupDescription", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setDbSecurityGroupDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSecurityGroupName", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setDbSecurityGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2SecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setEc2SecurityGroups(new ListUnmarshaller<AwsRdsDbSecurityGroupEc2SecurityGroup>(
                            AwsRdsDbSecurityGroupEc2SecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IpRanges", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setIpRanges(new ListUnmarshaller<AwsRdsDbSecurityGroupIpRange>(AwsRdsDbSecurityGroupIpRangeJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbSecurityGroupDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsDbSecurityGroupDetails;
    }

    private static AwsRdsDbSecurityGroupDetailsJsonUnmarshaller instance;

    public static AwsRdsDbSecurityGroupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbSecurityGroupDetailsJsonUnmarshaller();
        return instance;
    }
}
