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
 * AwsEc2SecurityGroupDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2SecurityGroupDetails, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2SecurityGroupDetails awsEc2SecurityGroupDetails = new AwsEc2SecurityGroupDetails();

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
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpPermissions", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setIpPermissions(new ListUnmarshaller<AwsEc2SecurityGroupIpPermission>(
                            AwsEc2SecurityGroupIpPermissionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("IpPermissionsEgress", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupDetails.setIpPermissionsEgress(new ListUnmarshaller<AwsEc2SecurityGroupIpPermission>(
                            AwsEc2SecurityGroupIpPermissionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2SecurityGroupDetails;
    }

    private static AwsEc2SecurityGroupDetailsJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupDetailsJsonUnmarshaller();
        return instance;
    }
}
