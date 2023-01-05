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
 * AwsEc2LaunchTemplateDataInstanceRequirementsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataInstanceRequirementsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2LaunchTemplateDataInstanceRequirementsDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataInstanceRequirementsDetails awsEc2LaunchTemplateDataInstanceRequirementsDetails = new AwsEc2LaunchTemplateDataInstanceRequirementsDetails();

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
                if (context.testExpression("AcceleratorCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setAcceleratorCount(AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetailsJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("AcceleratorManufacturers", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setAcceleratorManufacturers(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AcceleratorNames", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setAcceleratorNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AcceleratorTotalMemoryMiB", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setAcceleratorTotalMemoryMiB(AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetailsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("AcceleratorTypes", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setAcceleratorTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BareMetal", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setBareMetal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaselineEbsBandwidthMbps", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setBaselineEbsBandwidthMbps(AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetailsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("BurstablePerformance", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setBurstablePerformance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CpuManufacturers", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setCpuManufacturers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExcludedInstanceTypes", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setExcludedInstanceTypes(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InstanceGenerations", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setInstanceGenerations(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LocalStorage", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setLocalStorage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocalStorageTypes", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setLocalStorageTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("MemoryGiBPerVCpu", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setMemoryGiBPerVCpu(AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetailsJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("MemoryMiB", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setMemoryMiB(AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setNetworkInterfaceCount(AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("OnDemandMaxPricePercentageOverLowestPrice", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setOnDemandMaxPricePercentageOverLowestPrice(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("RequireHibernateSupport", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setRequireHibernateSupport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SpotMaxPricePercentageOverLowestPrice", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails.setSpotMaxPricePercentageOverLowestPrice(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("TotalLocalStorageGB", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setTotalLocalStorageGB(AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("VCpuCount", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataInstanceRequirementsDetails
                            .setVCpuCount(AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataInstanceRequirementsDetails;
    }

    private static AwsEc2LaunchTemplateDataInstanceRequirementsDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataInstanceRequirementsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataInstanceRequirementsDetailsJsonUnmarshaller();
        return instance;
    }
}
