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
 * CreateImageRequest Marshaller
 */

public class CreateImageRequestMarshaller implements Marshaller<Request<CreateImageRequest>, CreateImageRequest> {

    public Request<CreateImageRequest> marshall(CreateImageRequest createImageRequest) {

        if (createImageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateImageRequest> request = new DefaultRequest<CreateImageRequest>(createImageRequest, "AmazonEC2");
        request.addParameter("Action", "CreateImage");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createImageRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createImageRequest.getInstanceId()));
        }

        if (createImageRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createImageRequest.getName()));
        }

        if (createImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createImageRequest.getDescription()));
        }

        if (createImageRequest.getNoReboot() != null) {
            request.addParameter("NoReboot", StringUtils.fromBoolean(createImageRequest.getNoReboot()));
        }

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> createImageRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createImageRequest
                .getBlockDeviceMappings();
        if (!createImageRequestBlockDeviceMappingsList.isEmpty() || !createImageRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping createImageRequestBlockDeviceMappingsListValue : createImageRequestBlockDeviceMappingsList) {

                if (createImageRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getVirtualName()));
                }

                if (createImageRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                EbsBlockDevice ebs = createImageRequestBlockDeviceMappingsListValue.getEbs();
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

                if (createImageRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(createImageRequestBlockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        return request;
    }

}
