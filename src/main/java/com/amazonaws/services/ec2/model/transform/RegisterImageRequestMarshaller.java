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
 * Register Image Request Marshaller
 */
public class RegisterImageRequestMarshaller implements Marshaller<Request<RegisterImageRequest>, RegisterImageRequest> {

    public Request<RegisterImageRequest> marshall(RegisterImageRequest registerImageRequest) {

        if (registerImageRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RegisterImageRequest> request = new DefaultRequest<RegisterImageRequest>(registerImageRequest, "AmazonEC2");
        request.addParameter("Action", "RegisterImage");
        request.addParameter("Version", "2013-10-15");

        if (registerImageRequest.getImageLocation() != null) {
            request.addParameter("ImageLocation", StringUtils.fromString(registerImageRequest.getImageLocation()));
        }
        if (registerImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(registerImageRequest.getName()));
        }
        if (registerImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(registerImageRequest.getDescription()));
        }
        if (registerImageRequest.getArchitecture() != null) {
            request.addParameter("Architecture", StringUtils.fromString(registerImageRequest.getArchitecture()));
        }
        if (registerImageRequest.getKernelId() != null) {
            request.addParameter("KernelId", StringUtils.fromString(registerImageRequest.getKernelId()));
        }
        if (registerImageRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId", StringUtils.fromString(registerImageRequest.getRamdiskId()));
        }
        if (registerImageRequest.getRootDeviceName() != null) {
            request.addParameter("RootDeviceName", StringUtils.fromString(registerImageRequest.getRootDeviceName()));
        }

        java.util.List<BlockDeviceMapping> blockDeviceMappingsList = registerImageRequest.getBlockDeviceMappings();
        int blockDeviceMappingsListIndex = 1;

        for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
            BlockDeviceMapping blockDeviceMappingMember = blockDeviceMappingsListValue;
            if (blockDeviceMappingMember != null) {
                if (blockDeviceMappingMember.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingMember.getVirtualName()));
                }
                if (blockDeviceMappingMember.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingMember.getDeviceName()));
                }
                EbsBlockDevice ebsBlockDeviceEbs = blockDeviceMappingMember.getEbs();
                if (ebsBlockDeviceEbs != null) {
                    if (ebsBlockDeviceEbs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebsBlockDeviceEbs.getSnapshotId()));
                    }
                    if (ebsBlockDeviceEbs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebsBlockDeviceEbs.getVolumeSize()));
                    }
                    if (ebsBlockDeviceEbs.isDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebsBlockDeviceEbs.isDeleteOnTermination()));
                    }
                    if (ebsBlockDeviceEbs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType", StringUtils.fromString(ebsBlockDeviceEbs.getVolumeType()));
                    }
                    if (ebsBlockDeviceEbs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebsBlockDeviceEbs.getIops()));
                    }
                }
                if (blockDeviceMappingMember.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingMember.getNoDevice()));
                }
            }

            blockDeviceMappingsListIndex++;
        }
        if (registerImageRequest.getVirtualizationType() != null) {
            request.addParameter("VirtualizationType", StringUtils.fromString(registerImageRequest.getVirtualizationType()));
        }
        if (registerImageRequest.getSriovNetSupport() != null) {
            request.addParameter("SriovNetSupport", StringUtils.fromString(registerImageRequest.getSriovNetSupport()));
        }


        return request;
    }
}
