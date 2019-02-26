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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyInstanceAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceAttributeRequestMarshaller implements Marshaller<Request<ModifyInstanceAttributeRequest>, ModifyInstanceAttributeRequest> {

    public Request<ModifyInstanceAttributeRequest> marshall(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {

        if (modifyInstanceAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceAttributeRequest> request = new DefaultRequest<ModifyInstanceAttributeRequest>(modifyInstanceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceAttribute");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstanceAttributeRequest.getSourceDestCheck() != null) {
            request.addParameter("SourceDestCheck.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.getSourceDestCheck()));
        }

        if (modifyInstanceAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(modifyInstanceAttributeRequest.getAttribute()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification> modifyInstanceAttributeRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification>) modifyInstanceAttributeRequest
                .getBlockDeviceMappings();
        if (!modifyInstanceAttributeRequestBlockDeviceMappingsList.isEmpty() || !modifyInstanceAttributeRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (InstanceBlockDeviceMappingSpecification modifyInstanceAttributeRequestBlockDeviceMappingsListValue : modifyInstanceAttributeRequestBlockDeviceMappingsList) {

                if (modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                EbsInstanceBlockDeviceSpecification ebs = modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getVolumeId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeId", StringUtils.fromString(ebs.getVolumeId()));
                    }
                }

                if (modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getNoDevice()));
                }

                if (modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(modifyInstanceAttributeRequestBlockDeviceMappingsListValue.getVirtualName()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (modifyInstanceAttributeRequest.getDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.getDisableApiTermination()));
        }

        if (modifyInstanceAttributeRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.getEbsOptimized()));
        }

        if (modifyInstanceAttributeRequest.getEnaSupport() != null) {
            request.addParameter("EnaSupport.Value", StringUtils.fromBoolean(modifyInstanceAttributeRequest.getEnaSupport()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyInstanceAttributeRequestGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyInstanceAttributeRequest
                .getGroups();
        if (!modifyInstanceAttributeRequestGroupsList.isEmpty() || !modifyInstanceAttributeRequestGroupsList.isAutoConstruct()) {
            int groupsListIndex = 1;

            for (String modifyInstanceAttributeRequestGroupsListValue : modifyInstanceAttributeRequestGroupsList) {
                if (modifyInstanceAttributeRequestGroupsListValue != null) {
                    request.addParameter("GroupId." + groupsListIndex, StringUtils.fromString(modifyInstanceAttributeRequestGroupsListValue));
                }
                groupsListIndex++;
            }
        }

        if (modifyInstanceAttributeRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceId()));
        }

        if (modifyInstanceAttributeRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior.Value",
                    StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceInitiatedShutdownBehavior()));
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

        if (modifyInstanceAttributeRequest.getSriovNetSupport() != null) {
            request.addParameter("SriovNetSupport.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getSriovNetSupport()));
        }

        if (modifyInstanceAttributeRequest.getUserData() != null) {
            request.addParameter("UserData.Value", StringUtils.fromString(modifyInstanceAttributeRequest.getUserData()));
        }

        if (modifyInstanceAttributeRequest.getValue() != null) {
            request.addParameter("Value", StringUtils.fromString(modifyInstanceAttributeRequest.getValue()));
        }

        return request;
    }

}
