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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Request<ModifyInstanceAttributeRequest> request = new DefaultRequest<ModifyInstanceAttributeRequest>(modifyInstanceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceAttribute");
        request.addParameter("Version", "2010-06-15");
        if (modifyInstanceAttributeRequest != null) {
            if (modifyInstanceAttributeRequest.getInstanceId() != null) {
                request.addParameter("InstanceId", StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceId()));
            }
        }
        if (modifyInstanceAttributeRequest != null) {
            if (modifyInstanceAttributeRequest.getAttribute() != null) {
                request.addParameter("Attribute", StringUtils.fromString(modifyInstanceAttributeRequest.getAttribute()));
            }
        }
        if (modifyInstanceAttributeRequest != null) {
            if (modifyInstanceAttributeRequest.getValue() != null) {
                request.addParameter("Value", StringUtils.fromString(modifyInstanceAttributeRequest.getValue()));
            }
        }

        if (modifyInstanceAttributeRequest != null) {
            java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsList = modifyInstanceAttributeRequest.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;
            for (InstanceBlockDeviceMappingSpecification blockDeviceMappingsListValue : blockDeviceMappingsList) { 
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    EbsInstanceBlockDeviceSpecification ebs = blockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {
                        if (ebs.getVolumeId() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeId", StringUtils.fromString(ebs.getVolumeId()));
                        }
                    }
                    if (ebs != null) {
                        if (ebs.isDeleteOnTermination() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebs.isDeleteOnTermination()));
                        }
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingsListValue.getNoDevice()));
                    }
                }

                blockDeviceMappingsListIndex++;
            }
        }


        return request;
    }
}
