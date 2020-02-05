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
 * AwsEc2SecurityGroupIpPermission JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupIpPermissionJsonUnmarshaller implements Unmarshaller<AwsEc2SecurityGroupIpPermission, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupIpPermission unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2SecurityGroupIpPermission awsEc2SecurityGroupIpPermission = new AwsEc2SecurityGroupIpPermission();

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
                if (context.testExpression("IpProtocol", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setIpProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FromPort", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setFromPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ToPort", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setToPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UserIdGroupPairs", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setUserIdGroupPairs(new ListUnmarshaller<AwsEc2SecurityGroupUserIdGroupPair>(
                            AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("IpRanges", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setIpRanges(new ListUnmarshaller<AwsEc2SecurityGroupIpRange>(AwsEc2SecurityGroupIpRangeJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("Ipv6Ranges", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setIpv6Ranges(new ListUnmarshaller<AwsEc2SecurityGroupIpv6Range>(
                            AwsEc2SecurityGroupIpv6RangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("PrefixListIds", targetDepth)) {
                    context.nextToken();
                    awsEc2SecurityGroupIpPermission.setPrefixListIds(new ListUnmarshaller<AwsEc2SecurityGroupPrefixListId>(
                            AwsEc2SecurityGroupPrefixListIdJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2SecurityGroupIpPermission;
    }

    private static AwsEc2SecurityGroupIpPermissionJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupIpPermissionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupIpPermissionJsonUnmarshaller();
        return instance;
    }
}
