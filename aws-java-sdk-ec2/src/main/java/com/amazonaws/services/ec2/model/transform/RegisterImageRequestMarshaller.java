/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RegisterImageRequest Marshaller
 */

public class RegisterImageRequestMarshaller implements Marshaller<Request<RegisterImageRequest>, RegisterImageRequest> {

    public Request<RegisterImageRequest> marshall(RegisterImageRequest registerImageRequest) {

        if (registerImageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterImageRequest> request = new DefaultRequest<RegisterImageRequest>(registerImageRequest, "AmazonEC2");
        request.addParameter("Action", "RegisterImage");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

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

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> registerImageRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) registerImageRequest
                .getBlockDeviceMappings();
        if (!registerImageRequestBlockDeviceMappingsList.isEmpty() || !registerImageRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping registerImageRequestBlockDeviceMappingsListValue : registerImageRequestBlockDeviceMappingsList) {

                if (registerImageRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(registerImageRequestBlockDeviceMappingsListValue.getVirtualName()));
                }

                if (registerImageRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(registerImageRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                EbsBlockDevice ebs = registerImageRequestBlockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                StringUtils.fromString(ebs.getSnapshotId()));
                    }

                    if (ebs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                StringUtils.fromInteger(ebs.getVolumeSize()));
                    }

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                StringUtils.fromString(ebs.getVolumeType()));
                    }

                    if (ebs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                    }

                    if (ebs.getEncrypted() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                StringUtils.fromBoolean(ebs.getEncrypted()));
                    }
                }

                if (registerImageRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(registerImageRequestBlockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (registerImageRequest.getVirtualizationType() != null) {
            request.addParameter("VirtualizationType", StringUtils.fromString(registerImageRequest.getVirtualizationType()));
        }

        if (registerImageRequest.getSriovNetSupport() != null) {
            request.addParameter("SriovNetSupport", StringUtils.fromString(registerImageRequest.getSriovNetSupport()));
        }

        if (registerImageRequest.getEnaSupport() != null) {
            request.addParameter("EnaSupport", StringUtils.fromBoolean(registerImageRequest.getEnaSupport()));
        }

        return request;
    }

}
