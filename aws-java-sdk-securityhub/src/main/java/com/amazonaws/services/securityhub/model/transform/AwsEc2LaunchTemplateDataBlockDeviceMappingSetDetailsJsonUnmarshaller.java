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
 * AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails();

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
                if (context.testExpression("DeviceName", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ebs", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.setEbs(AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NoDevice", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.setNoDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VirtualName", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.setVirtualName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails;
    }

    private static AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsJsonUnmarshaller();
        return instance;
    }
}
