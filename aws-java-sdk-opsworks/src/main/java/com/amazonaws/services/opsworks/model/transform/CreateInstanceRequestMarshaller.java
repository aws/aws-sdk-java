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
package com.amazonaws.services.opsworks.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateInstanceRequestMarshaller {

    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<List> LAYERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LayerIds").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> AUTOSCALINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingType").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hostname").build();
    private static final MarshallingInfo<String> OS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Os").build();
    private static final MarshallingInfo<String> AMIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AmiId").build();
    private static final MarshallingInfo<String> SSHKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshKeyName").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> VIRTUALIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VirtualizationType").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Architecture").build();
    private static final MarshallingInfo<String> ROOTDEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootDeviceType").build();
    private static final MarshallingInfo<List> BLOCKDEVICEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDeviceMappings").build();
    private static final MarshallingInfo<Boolean> INSTALLUPDATESONBOOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstallUpdatesOnBoot").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();
    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();
    private static final MarshallingInfo<String> TENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tenancy").build();

    private static final CreateInstanceRequestMarshaller instance = new CreateInstanceRequestMarshaller();

    public static CreateInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateInstanceRequest createInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createInstanceRequest.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getLayerIds(), LAYERIDS_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getAutoScalingType(), AUTOSCALINGTYPE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getOs(), OS_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getAmiId(), AMIID_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getSshKeyName(), SSHKEYNAME_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getVirtualizationType(), VIRTUALIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getRootDeviceType(), ROOTDEVICETYPE_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getBlockDeviceMappings(), BLOCKDEVICEMAPPINGS_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getInstallUpdatesOnBoot(), INSTALLUPDATESONBOOT_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getEbsOptimized(), EBSOPTIMIZED_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(createInstanceRequest.getTenancy(), TENANCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
