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
 * ResponseLaunchTemplateData StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseLaunchTemplateDataStaxUnmarshaller implements Unmarshaller<ResponseLaunchTemplateData, StaxUnmarshallerContext> {

    public ResponseLaunchTemplateData unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResponseLaunchTemplateData responseLaunchTemplateData = new ResponseLaunchTemplateData();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return responseLaunchTemplateData;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("kernelId", targetDepth)) {
                    responseLaunchTemplateData.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebsOptimized", targetDepth)) {
                    responseLaunchTemplateData.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    responseLaunchTemplateData.setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("blockDeviceMappingSet", targetDepth)) {
                    responseLaunchTemplateData.withBlockDeviceMappings(new ArrayList<LaunchTemplateBlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("blockDeviceMappingSet/item", targetDepth)) {
                    responseLaunchTemplateData.withBlockDeviceMappings(LaunchTemplateBlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceSet", targetDepth)) {
                    responseLaunchTemplateData.withNetworkInterfaces(new ArrayList<LaunchTemplateInstanceNetworkInterfaceSpecification>());
                    continue;
                }

                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    responseLaunchTemplateData.withNetworkInterfaces(LaunchTemplateInstanceNetworkInterfaceSpecificationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    responseLaunchTemplateData.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    responseLaunchTemplateData.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("keyName", targetDepth)) {
                    responseLaunchTemplateData.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("monitoring", targetDepth)) {
                    responseLaunchTemplateData.setMonitoring(LaunchTemplatesMonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placement", targetDepth)) {
                    responseLaunchTemplateData.setPlacement(LaunchTemplatePlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ramDiskId", targetDepth)) {
                    responseLaunchTemplateData.setRamDiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("disableApiTermination", targetDepth)) {
                    responseLaunchTemplateData.setDisableApiTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceInitiatedShutdownBehavior", targetDepth)) {
                    responseLaunchTemplateData.setInstanceInitiatedShutdownBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("userData", targetDepth)) {
                    responseLaunchTemplateData.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSpecificationSet", targetDepth)) {
                    responseLaunchTemplateData.withTagSpecifications(new ArrayList<LaunchTemplateTagSpecification>());
                    continue;
                }

                if (context.testExpression("tagSpecificationSet/item", targetDepth)) {
                    responseLaunchTemplateData.withTagSpecifications(LaunchTemplateTagSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticGpuSpecificationSet", targetDepth)) {
                    responseLaunchTemplateData.withElasticGpuSpecifications(new ArrayList<ElasticGpuSpecificationResponse>());
                    continue;
                }

                if (context.testExpression("elasticGpuSpecificationSet/item", targetDepth)) {
                    responseLaunchTemplateData.withElasticGpuSpecifications(ElasticGpuSpecificationResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticInferenceAcceleratorSet", targetDepth)) {
                    responseLaunchTemplateData.withElasticInferenceAccelerators(new ArrayList<LaunchTemplateElasticInferenceAcceleratorResponse>());
                    continue;
                }

                if (context.testExpression("elasticInferenceAcceleratorSet/item", targetDepth)) {
                    responseLaunchTemplateData.withElasticInferenceAccelerators(LaunchTemplateElasticInferenceAcceleratorResponseStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupIdSet", targetDepth)) {
                    responseLaunchTemplateData.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("securityGroupIdSet/item", targetDepth)) {
                    responseLaunchTemplateData.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupSet", targetDepth)) {
                    responseLaunchTemplateData.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("securityGroupSet/item", targetDepth)) {
                    responseLaunchTemplateData.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceMarketOptions", targetDepth)) {
                    responseLaunchTemplateData.setInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creditSpecification", targetDepth)) {
                    responseLaunchTemplateData.setCreditSpecification(CreditSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("cpuOptions", targetDepth)) {
                    responseLaunchTemplateData.setCpuOptions(LaunchTemplateCpuOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("capacityReservationSpecification", targetDepth)) {
                    responseLaunchTemplateData.setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationResponseStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hibernationOptions", targetDepth)) {
                    responseLaunchTemplateData.setHibernationOptions(LaunchTemplateHibernationOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("licenseSet", targetDepth)) {
                    responseLaunchTemplateData.withLicenseSpecifications(new ArrayList<LaunchTemplateLicenseConfiguration>());
                    continue;
                }

                if (context.testExpression("licenseSet/item", targetDepth)) {
                    responseLaunchTemplateData.withLicenseSpecifications(LaunchTemplateLicenseConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return responseLaunchTemplateData;
                }
            }
        }
    }

    private static ResponseLaunchTemplateDataStaxUnmarshaller instance;

    public static ResponseLaunchTemplateDataStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseLaunchTemplateDataStaxUnmarshaller();
        return instance;
    }
}
