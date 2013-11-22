/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Instance Attribute Request Marshaller
 */
public class ModifyInstanceAttributeRequestMarshaller implements Marshaller<Request<ModifyInstanceAttributeRequest>, ModifyInstanceAttributeRequest> {

    public Request<ModifyInstanceAttributeRequest> marshall(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {

        if (modifyInstanceAttributeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyInstanceAttributeRequest> request = new DefaultRequest<ModifyInstanceAttributeRequest>(modifyInstanceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceAttribute");
        request.addParameter("Version", "2013-10-15");

        if (modifyInstanceAttributeRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceId()));
        }
        if (modifyInstanceAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(modifyInstanceAttributeRequest.getAttribute()));
        }
        if (modifyInstanceAttributeRequest.getValue() != null) {
            request.addParameter("Value", StringUtils.fromString(modifyInstanceAttributeRequest.getValue()));
        }

        java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsList = modifyInstanceAttributeRequest.getBlockDeviceMappings();
        int blockDeviceMappingsListIndex = 1;

        for (InstanceBlockDeviceMappingSpecification blockDeviceMappingsListValue : blockDeviceMappingsList) {
            InstanceBlockDeviceMappingSpecification instanceBlockDeviceMappingSpecificationMember = blockDeviceMappingsListValue;
            if (instanceBlockDeviceMappingSpecificationMember != null) {
                if (instanceBlockDeviceMappingSpecificationMember.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(instanceBlockDeviceMappingSpecificationMember.getDeviceName()));
                }
                EbsInstanceBlockDeviceSpecification ebsInstanceBlockDeviceSpecificationEbs = instanceBlockDeviceMappingSpecificationMember.getEbs();
                if (ebsInstanceBlockDeviceSpecificationEbs != null) {
                    if (ebsInstanceBlockDeviceSpecificationEbs.getVolumeId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeId", StringUtils.fromString(ebsInstanceBlockDeviceSpecificationEbs.getVolumeId()));
                    }
                    if (ebsInstanceBlockDeviceSpecificationEbs.isDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebsInstanceBlockDeviceSpecificationEbs.isDeleteOnTermination()));
                    }
                }
                if (instanceBlockDeviceMappingSpecificationMember.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(instanceBlockDeviceMappingSpecificationMember.getVirtualName()));
                }
                if (instanceBlockDeviceMappingSpecificationMember.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(instanceBlockDeviceMappingSpecificationMember.getNoDevice()));
                }
            }

            blockDeviceMappingsListIndex++;
        }
        if (modifyInstanceAttributeRequest.isSourceDestCheck() != null) {
            request.addParameter("SourceDestCheck.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.isSourceDestCheck()));
        }
        if (modifyInstanceAttributeRequest.isDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.isDisableApiTermination()));
        }
        if (modifyInstanceAttributeRequest.getInstanceType() != null) {
            request.addParameter("InstanceType.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceType()));
        }
        if (modifyInstanceAttributeRequest.getKernel() != null) {
            request.addParameter("Kernel.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getKernel()));
        }
        if (modifyInstanceAttributeRequest.getRamdisk() != null) {
            request.addParameter("Ramdisk.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getRamdisk()));
        }
        if (modifyInstanceAttributeRequest.getUserData() != null) {
            request.addParameter("UserData.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getUserData()));
        }
        if (modifyInstanceAttributeRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceInitiatedShutdownBehavior()));
        }

        java.util.List<String> groupsList = modifyInstanceAttributeRequest.getGroups();
        int groupsListIndex = 1;

        for (String groupsListValue : groupsList) {
            if (groupsListValue != null) {
                request.addParameter("GroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
            }

            groupsListIndex++;
        }
        if (modifyInstanceAttributeRequest.isEbsOptimized() != null) {
            request.addParameter("EbsOptimized.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.isEbsOptimized()));
        }
        if (modifyInstanceAttributeRequest.getSriovNetSupport() != null) {
            request.addParameter("SriovNetSupport.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getSriovNetSupport()));
        }


        return request;
    }
}
