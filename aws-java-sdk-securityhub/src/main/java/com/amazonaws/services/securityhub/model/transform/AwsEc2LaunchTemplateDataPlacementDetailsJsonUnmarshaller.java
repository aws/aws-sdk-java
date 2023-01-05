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
 * AwsEc2LaunchTemplateDataPlacementDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataPlacementDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2LaunchTemplateDataPlacementDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataPlacementDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataPlacementDetails awsEc2LaunchTemplateDataPlacementDetails = new AwsEc2LaunchTemplateDataPlacementDetails();

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
                if (context.testExpression("Affinity", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setAffinity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setHostId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostResourceGroupArn", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setHostResourceGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartitionNumber", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setPartitionNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SpreadDomain", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setSpreadDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tenancy", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataPlacementDetails.setTenancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataPlacementDetails;
    }

    private static AwsEc2LaunchTemplateDataPlacementDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataPlacementDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataPlacementDetailsJsonUnmarshaller();
        return instance;
    }
}
