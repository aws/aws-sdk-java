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
 * Create Image Request Marshaller
 */
public class CreateImageRequestMarshaller implements Marshaller<Request<CreateImageRequest>, CreateImageRequest> {

    public Request<CreateImageRequest> marshall(CreateImageRequest createImageRequest) {

        if (createImageRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateImageRequest> request = new DefaultRequest<CreateImageRequest>(createImageRequest, "AmazonEC2");
        request.addParameter("Action", "CreateImage");
        request.addParameter("Version", "2013-10-15");

        if (createImageRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createImageRequest.getInstanceId()));
        }
        if (createImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createImageRequest.getName()));
        }
        if (createImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createImageRequest.getDescription()));
        }
        if (createImageRequest.isNoReboot() != null) {
            request.addParameter("NoReboot", StringUtils.fromBoolean(createImageRequest.isNoReboot()));
        }

        java.util.List<BlockDeviceMapping> blockDeviceMappingsList = createImageRequest.getBlockDeviceMappings();
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


        return request;
    }
}
