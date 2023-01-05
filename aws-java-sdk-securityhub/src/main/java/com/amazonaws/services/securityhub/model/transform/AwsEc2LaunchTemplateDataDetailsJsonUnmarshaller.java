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
 * AwsEc2LaunchTemplateDataDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2LaunchTemplateDataDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDataDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDataDetails awsEc2LaunchTemplateDataDetails = new AwsEc2LaunchTemplateDataDetails();

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
                if (context.testExpression("BlockDeviceMappingSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setBlockDeviceMappingSet(new ListUnmarshaller<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails>(
                            AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CapacityReservationSpecification", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails
                            .setCapacityReservationSpecification(AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("CpuOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setCpuOptions(AwsEc2LaunchTemplateDataCpuOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreditSpecification", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setCreditSpecification(AwsEc2LaunchTemplateDataCreditSpecificationDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DisableApiStop", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setDisableApiStop(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DisableApiTermination", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setDisableApiTermination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ElasticGpuSpecificationSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails
                            .setElasticGpuSpecificationSet(new ListUnmarshaller<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails>(
                                    AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("ElasticInferenceAcceleratorSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails
                            .setElasticInferenceAcceleratorSet(new ListUnmarshaller<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails>(
                                    AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("EnclaveOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setEnclaveOptions(AwsEc2LaunchTemplateDataEnclaveOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("HibernationOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setHibernationOptions(AwsEc2LaunchTemplateDataHibernationOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setIamInstanceProfile(AwsEc2LaunchTemplateDataIamInstanceProfileDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ImageId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceInitiatedShutdownBehavior", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setInstanceInitiatedShutdownBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceMarketOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setInstanceMarketOptions(AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("InstanceRequirements", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setInstanceRequirements(AwsEc2LaunchTemplateDataInstanceRequirementsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KernelId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setKernelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyName", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setLicenseSet(new ListUnmarshaller<AwsEc2LaunchTemplateDataLicenseSetDetails>(
                            AwsEc2LaunchTemplateDataLicenseSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MaintenanceOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setMaintenanceOptions(AwsEc2LaunchTemplateDataMaintenanceOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("MetadataOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setMetadataOptions(AwsEc2LaunchTemplateDataMetadataOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("Monitoring", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setMonitoring(AwsEc2LaunchTemplateDataMonitoringDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setNetworkInterfaceSet(new ListUnmarshaller<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails>(
                            AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Placement", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setPlacement(AwsEc2LaunchTemplateDataPlacementDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrivateDnsNameOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setPrivateDnsNameOptions(AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RamDiskId", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setRamDiskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIdSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setSecurityGroupIdSet(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityGroupSet", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setSecurityGroupSet(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UserData", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDataDetails.setUserData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDataDetails;
    }

    private static AwsEc2LaunchTemplateDataDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDataDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDataDetailsJsonUnmarshaller();
        return instance;
    }
}
