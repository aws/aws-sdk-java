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
 * AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails();

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
                if (context.testExpression("DeleteOnTermination", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setDeleteOnTermination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Throughput", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setThroughput(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VolumeSize", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setVolumeSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails;
    }

    private static AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsJsonUnmarshaller();
        return instance;
    }
}
