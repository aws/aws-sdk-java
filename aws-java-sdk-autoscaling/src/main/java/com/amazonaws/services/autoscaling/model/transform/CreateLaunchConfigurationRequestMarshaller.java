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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateLaunchConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchConfigurationRequestMarshaller implements Marshaller<Request<CreateLaunchConfigurationRequest>, CreateLaunchConfigurationRequest> {

    public Request<CreateLaunchConfigurationRequest> marshall(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) {

        if (createLaunchConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLaunchConfigurationRequest> request = new DefaultRequest<CreateLaunchConfigurationRequest>(createLaunchConfigurationRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "CreateLaunchConfiguration");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLaunchConfigurationRequest.getLaunchConfigurationName() != null) {
            request.addParameter("LaunchConfigurationName", StringUtils.fromString(createLaunchConfigurationRequest.getLaunchConfigurationName()));
        }

        if (createLaunchConfigurationRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(createLaunchConfigurationRequest.getImageId()));
        }

        if (createLaunchConfigurationRequest.getKeyName() != null) {
            request.addParameter("KeyName", StringUtils.fromString(createLaunchConfigurationRequest.getKeyName()));
        }

        if (!createLaunchConfigurationRequest.getSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createLaunchConfigurationRequest.getSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createLaunchConfigurationRequest
                    .getSecurityGroups();
            int securityGroupsListIndex = 1;

            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }

        if (createLaunchConfigurationRequest.getClassicLinkVPCId() != null) {
            request.addParameter("ClassicLinkVPCId", StringUtils.fromString(createLaunchConfigurationRequest.getClassicLinkVPCId()));
        }

        if (!createLaunchConfigurationRequest.getClassicLinkVPCSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createLaunchConfigurationRequest.getClassicLinkVPCSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> classicLinkVPCSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createLaunchConfigurationRequest
                    .getClassicLinkVPCSecurityGroups();
            int classicLinkVPCSecurityGroupsListIndex = 1;

            for (String classicLinkVPCSecurityGroupsListValue : classicLinkVPCSecurityGroupsList) {
                if (classicLinkVPCSecurityGroupsListValue != null) {
                    request.addParameter("ClassicLinkVPCSecurityGroups.member." + classicLinkVPCSecurityGroupsListIndex,
                            StringUtils.fromString(classicLinkVPCSecurityGroupsListValue));
                }
                classicLinkVPCSecurityGroupsListIndex++;
            }
        }

        if (createLaunchConfigurationRequest.getUserData() != null) {
            request.addParameter("UserData", StringUtils.fromString(createLaunchConfigurationRequest.getUserData()));
        }

        if (createLaunchConfigurationRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createLaunchConfigurationRequest.getInstanceId()));
        }

        if (createLaunchConfigurationRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(createLaunchConfigurationRequest.getInstanceType()));
        }

        if (createLaunchConfigurationRequest.getKernelId() != null) {
            request.addParameter("KernelId", StringUtils.fromString(createLaunchConfigurationRequest.getKernelId()));
        }

        if (createLaunchConfigurationRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId", StringUtils.fromString(createLaunchConfigurationRequest.getRamdiskId()));
        }

        if (!createLaunchConfigurationRequest.getBlockDeviceMappings().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createLaunchConfigurationRequest.getBlockDeviceMappings()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createLaunchConfigurationRequest
                    .getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {

                if (blockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                }

                if (blockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                }

                {
                    Ebs ebs = blockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {

                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                    StringUtils.fromString(ebs.getSnapshotId()));
                        }

                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                    StringUtils.fromInteger(ebs.getVolumeSize()));
                        }

                        if (ebs.getVolumeType() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                    StringUtils.fromString(ebs.getVolumeType()));
                        }

                        if (ebs.getDeleteOnTermination() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                    StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                        }

                        if (ebs.getIops() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.Iops",
                                    StringUtils.fromInteger(ebs.getIops()));
                        }

                        if (ebs.getEncrypted() != null) {
                            request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                    StringUtils.fromBoolean(ebs.getEncrypted()));
                        }
                    }
                }

                if (blockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromBoolean(blockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        {
            InstanceMonitoring instanceMonitoring = createLaunchConfigurationRequest.getInstanceMonitoring();
            if (instanceMonitoring != null) {

                if (instanceMonitoring.getEnabled() != null) {
                    request.addParameter("InstanceMonitoring.Enabled", StringUtils.fromBoolean(instanceMonitoring.getEnabled()));
                }
            }
        }

        if (createLaunchConfigurationRequest.getSpotPrice() != null) {
            request.addParameter("SpotPrice", StringUtils.fromString(createLaunchConfigurationRequest.getSpotPrice()));
        }

        if (createLaunchConfigurationRequest.getIamInstanceProfile() != null) {
            request.addParameter("IamInstanceProfile", StringUtils.fromString(createLaunchConfigurationRequest.getIamInstanceProfile()));
        }

        if (createLaunchConfigurationRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils.fromBoolean(createLaunchConfigurationRequest.getEbsOptimized()));
        }

        if (createLaunchConfigurationRequest.getAssociatePublicIpAddress() != null) {
            request.addParameter("AssociatePublicIpAddress", StringUtils.fromBoolean(createLaunchConfigurationRequest.getAssociatePublicIpAddress()));
        }

        if (createLaunchConfigurationRequest.getPlacementTenancy() != null) {
            request.addParameter("PlacementTenancy", StringUtils.fromString(createLaunchConfigurationRequest.getPlacementTenancy()));
        }

        return request;
    }

}
