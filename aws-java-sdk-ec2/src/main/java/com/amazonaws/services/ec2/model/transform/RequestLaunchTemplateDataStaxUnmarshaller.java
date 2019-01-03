/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RequestLaunchTemplateData StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestLaunchTemplateDataStaxUnmarshaller implements Unmarshaller<RequestLaunchTemplateData, StaxUnmarshallerContext> {

    public RequestLaunchTemplateData unmarshall(StaxUnmarshallerContext context) throws Exception {
        RequestLaunchTemplateData requestLaunchTemplateData = new RequestLaunchTemplateData();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return requestLaunchTemplateData;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("KernelId", targetDepth)) {
                    requestLaunchTemplateData.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EbsOptimized", targetDepth)) {
                    requestLaunchTemplateData.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    requestLaunchTemplateData.setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationRequestStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("BlockDeviceMapping", targetDepth)) {
                    requestLaunchTemplateData.withBlockDeviceMappings(new ArrayList<LaunchTemplateBlockDeviceMappingRequest>());
                    continue;
                }

                if (context.testExpression("BlockDeviceMapping/BlockDeviceMapping", targetDepth)) {
                    requestLaunchTemplateData
                            .withBlockDeviceMappings(LaunchTemplateBlockDeviceMappingRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterface", targetDepth)) {
                    requestLaunchTemplateData.withNetworkInterfaces(new ArrayList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>());
                    continue;
                }

                if (context.testExpression("NetworkInterface/InstanceNetworkInterfaceSpecification", targetDepth)) {
                    requestLaunchTemplateData.withNetworkInterfaces(LaunchTemplateInstanceNetworkInterfaceSpecificationRequestStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImageId", targetDepth)) {
                    requestLaunchTemplateData.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceType", targetDepth)) {
                    requestLaunchTemplateData.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KeyName", targetDepth)) {
                    requestLaunchTemplateData.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Monitoring", targetDepth)) {
                    requestLaunchTemplateData.setMonitoring(LaunchTemplatesMonitoringRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Placement", targetDepth)) {
                    requestLaunchTemplateData.setPlacement(LaunchTemplatePlacementRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RamDiskId", targetDepth)) {
                    requestLaunchTemplateData.setRamDiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DisableApiTermination", targetDepth)) {
                    requestLaunchTemplateData.setDisableApiTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceInitiatedShutdownBehavior", targetDepth)) {
                    requestLaunchTemplateData.setInstanceInitiatedShutdownBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserData", targetDepth)) {
                    requestLaunchTemplateData.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagSpecification", targetDepth)) {
                    requestLaunchTemplateData.withTagSpecifications(new ArrayList<LaunchTemplateTagSpecificationRequest>());
                    continue;
                }

                if (context.testExpression("TagSpecification/LaunchTemplateTagSpecificationRequest", targetDepth)) {
                    requestLaunchTemplateData.withTagSpecifications(LaunchTemplateTagSpecificationRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElasticGpuSpecification", targetDepth)) {
                    requestLaunchTemplateData.withElasticGpuSpecifications(new ArrayList<ElasticGpuSpecification>());
                    continue;
                }

                if (context.testExpression("ElasticGpuSpecification/ElasticGpuSpecification", targetDepth)) {
                    requestLaunchTemplateData.withElasticGpuSpecifications(ElasticGpuSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElasticInferenceAccelerator", targetDepth)) {
                    requestLaunchTemplateData.withElasticInferenceAccelerators(new ArrayList<LaunchTemplateElasticInferenceAccelerator>());
                    continue;
                }

                if (context.testExpression("ElasticInferenceAccelerator/item", targetDepth)) {
                    requestLaunchTemplateData.withElasticInferenceAccelerators(LaunchTemplateElasticInferenceAcceleratorStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroupId", targetDepth)) {
                    requestLaunchTemplateData.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroupId/SecurityGroupId", targetDepth)) {
                    requestLaunchTemplateData.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroup", targetDepth)) {
                    requestLaunchTemplateData.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroup/SecurityGroup", targetDepth)) {
                    requestLaunchTemplateData.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceMarketOptions", targetDepth)) {
                    requestLaunchTemplateData.setInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsRequestStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("CreditSpecification", targetDepth)) {
                    requestLaunchTemplateData.setCreditSpecification(CreditSpecificationRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CpuOptions", targetDepth)) {
                    requestLaunchTemplateData.setCpuOptions(LaunchTemplateCpuOptionsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CapacityReservationSpecification", targetDepth)) {
                    requestLaunchTemplateData.setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationRequestStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HibernationOptions", targetDepth)) {
                    requestLaunchTemplateData.setHibernationOptions(LaunchTemplateHibernationOptionsRequestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LicenseSpecification", targetDepth)) {
                    requestLaunchTemplateData.withLicenseSpecifications(new ArrayList<LaunchTemplateLicenseConfigurationRequest>());
                    continue;
                }

                if (context.testExpression("LicenseSpecification/item", targetDepth)) {
                    requestLaunchTemplateData.withLicenseSpecifications(LaunchTemplateLicenseConfigurationRequestStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return requestLaunchTemplateData;
                }
            }
        }
    }

    private static RequestLaunchTemplateDataStaxUnmarshaller instance;

    public static RequestLaunchTemplateDataStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestLaunchTemplateDataStaxUnmarshaller();
        return instance;
    }
}
