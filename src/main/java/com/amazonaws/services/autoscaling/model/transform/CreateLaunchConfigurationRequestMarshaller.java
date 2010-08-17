/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Launch Configuration Request Marshaller
 */
public class CreateLaunchConfigurationRequestMarshaller implements Marshaller<Request<CreateLaunchConfigurationRequest>, CreateLaunchConfigurationRequest> {

    public Request<CreateLaunchConfigurationRequest> marshall(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) {
        Request<CreateLaunchConfigurationRequest> request = new DefaultRequest<CreateLaunchConfigurationRequest>(createLaunchConfigurationRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateLaunchConfiguration");
        request.addParameter("Version", "2009-05-15");
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getLaunchConfigurationName() != null) {
                request.addParameter("LaunchConfigurationName", StringUtils.fromString(createLaunchConfigurationRequest.getLaunchConfigurationName()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getImageId() != null) {
                request.addParameter("ImageId", StringUtils.fromString(createLaunchConfigurationRequest.getImageId()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getKeyName() != null) {
                request.addParameter("KeyName", StringUtils.fromString(createLaunchConfigurationRequest.getKeyName()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            java.util.List<String> securityGroupsList = createLaunchConfigurationRequest.getSecurityGroups();
            int securityGroupsListIndex = 1;
            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getUserData() != null) {
                request.addParameter("UserData", StringUtils.fromString(createLaunchConfigurationRequest.getUserData()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getInstanceType() != null) {
                request.addParameter("InstanceType", StringUtils.fromString(createLaunchConfigurationRequest.getInstanceType()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getKernelId() != null) {
                request.addParameter("KernelId", StringUtils.fromString(createLaunchConfigurationRequest.getKernelId()));
            }
        }
        if (createLaunchConfigurationRequest != null) {
            if (createLaunchConfigurationRequest.getRamdiskId() != null) {
                request.addParameter("RamdiskId", StringUtils.fromString(createLaunchConfigurationRequest.getRamdiskId()));
            }
        }

        if (createLaunchConfigurationRequest != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappingsList = createLaunchConfigurationRequest.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;
            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("BlockDeviceMappings.member." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                    }
                }

                blockDeviceMappingsListIndex++;
            }
        }


        return request;
    }
}
