/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Register Image Request Marshaller
 */
public class RegisterImageRequestMarshaller implements Marshaller<Request<RegisterImageRequest>, RegisterImageRequest> {

    public Request<RegisterImageRequest> marshall(RegisterImageRequest registerImageRequest) {
        Request<RegisterImageRequest> request = new DefaultRequest<RegisterImageRequest>(registerImageRequest, "AmazonEC2");
        request.addParameter("Action", "RegisterImage");
        request.addParameter("Version", "2011-02-28");
        if (registerImageRequest != null) {
            if (registerImageRequest.getImageLocation() != null) {
                request.addParameter("ImageLocation", StringUtils.fromString(registerImageRequest.getImageLocation()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getName() != null) {
                request.addParameter("Name", StringUtils.fromString(registerImageRequest.getName()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getDescription() != null) {
                request.addParameter("Description", StringUtils.fromString(registerImageRequest.getDescription()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getArchitecture() != null) {
                request.addParameter("Architecture", StringUtils.fromString(registerImageRequest.getArchitecture()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getKernelId() != null) {
                request.addParameter("KernelId", StringUtils.fromString(registerImageRequest.getKernelId()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getRamdiskId() != null) {
                request.addParameter("RamdiskId", StringUtils.fromString(registerImageRequest.getRamdiskId()));
            }
        }
        if (registerImageRequest != null) {
            if (registerImageRequest.getRootDeviceName() != null) {
                request.addParameter("RootDeviceName", StringUtils.fromString(registerImageRequest.getRootDeviceName()));
            }
        }

        if (registerImageRequest != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappingsList = registerImageRequest.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;
            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {
                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebs.getSnapshotId()));
                        }
                    }
                    if (ebs != null) {
                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebs.getVolumeSize()));
                        }
                    }
                    if (ebs != null) {
                        if (ebs.isDeleteOnTermination() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebs.isDeleteOnTermination()));
                        }
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
