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
 * InstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceMarshaller {

    private static final MarshallingInfo<String> AGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentVersion").build();
    private static final MarshallingInfo<String> AMIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AmiId").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Architecture").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> AUTOSCALINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingType").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<List> BLOCKDEVICEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDeviceMappings").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();
    private static final MarshallingInfo<String> EC2INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2InstanceId").build();
    private static final MarshallingInfo<String> ECSCLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EcsClusterArn").build();
    private static final MarshallingInfo<String> ECSCONTAINERINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EcsContainerInstanceArn").build();
    private static final MarshallingInfo<String> ELASTICIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ElasticIp").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hostname").build();
    private static final MarshallingInfo<String> INFRASTRUCTURECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InfrastructureClass").build();
    private static final MarshallingInfo<Boolean> INSTALLUPDATESONBOOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstallUpdatesOnBoot").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileArn").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> LASTSERVICEERRORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastServiceErrorId").build();
    private static final MarshallingInfo<List> LAYERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LayerIds").build();
    private static final MarshallingInfo<String> OS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Os").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Platform").build();
    private static final MarshallingInfo<String> PRIVATEDNS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateDns").build();
    private static final MarshallingInfo<String> PRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PrivateIp").build();
    private static final MarshallingInfo<String> PUBLICDNS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicDns").build();
    private static final MarshallingInfo<String> PUBLICIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicIp").build();
    private static final MarshallingInfo<String> REGISTEREDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredBy").build();
    private static final MarshallingInfo<String> REPORTEDAGENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportedAgentVersion").build();
    private static final MarshallingInfo<StructuredPojo> REPORTEDOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportedOs").build();
    private static final MarshallingInfo<String> ROOTDEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootDeviceType").build();
    private static final MarshallingInfo<String> ROOTDEVICEVOLUMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootDeviceVolumeId").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> SSHHOSTDSAKEYFINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshHostDsaKeyFingerprint").build();
    private static final MarshallingInfo<String> SSHHOSTRSAKEYFINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshHostRsaKeyFingerprint").build();
    private static final MarshallingInfo<String> SSHKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SshKeyName").build();
    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> TENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tenancy").build();
    private static final MarshallingInfo<String> VIRTUALIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VirtualizationType").build();

    private static final InstanceMarshaller instance = new InstanceMarshaller();

    public static InstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Instance instance, ProtocolMarshaller protocolMarshaller) {

        if (instance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instance.getAgentVersion(), AGENTVERSION_BINDING);
            protocolMarshaller.marshall(instance.getAmiId(), AMIID_BINDING);
            protocolMarshaller.marshall(instance.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(instance.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(instance.getAutoScalingType(), AUTOSCALINGTYPE_BINDING);
            protocolMarshaller.marshall(instance.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(instance.getBlockDeviceMappings(), BLOCKDEVICEMAPPINGS_BINDING);
            protocolMarshaller.marshall(instance.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(instance.getEbsOptimized(), EBSOPTIMIZED_BINDING);
            protocolMarshaller.marshall(instance.getEc2InstanceId(), EC2INSTANCEID_BINDING);
            protocolMarshaller.marshall(instance.getEcsClusterArn(), ECSCLUSTERARN_BINDING);
            protocolMarshaller.marshall(instance.getEcsContainerInstanceArn(), ECSCONTAINERINSTANCEARN_BINDING);
            protocolMarshaller.marshall(instance.getElasticIp(), ELASTICIP_BINDING);
            protocolMarshaller.marshall(instance.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(instance.getInfrastructureClass(), INFRASTRUCTURECLASS_BINDING);
            protocolMarshaller.marshall(instance.getInstallUpdatesOnBoot(), INSTALLUPDATESONBOOT_BINDING);
            protocolMarshaller.marshall(instance.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instance.getInstanceProfileArn(), INSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(instance.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instance.getLastServiceErrorId(), LASTSERVICEERRORID_BINDING);
            protocolMarshaller.marshall(instance.getLayerIds(), LAYERIDS_BINDING);
            protocolMarshaller.marshall(instance.getOs(), OS_BINDING);
            protocolMarshaller.marshall(instance.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(instance.getPrivateDns(), PRIVATEDNS_BINDING);
            protocolMarshaller.marshall(instance.getPrivateIp(), PRIVATEIP_BINDING);
            protocolMarshaller.marshall(instance.getPublicDns(), PUBLICDNS_BINDING);
            protocolMarshaller.marshall(instance.getPublicIp(), PUBLICIP_BINDING);
            protocolMarshaller.marshall(instance.getRegisteredBy(), REGISTEREDBY_BINDING);
            protocolMarshaller.marshall(instance.getReportedAgentVersion(), REPORTEDAGENTVERSION_BINDING);
            protocolMarshaller.marshall(instance.getReportedOs(), REPORTEDOS_BINDING);
            protocolMarshaller.marshall(instance.getRootDeviceType(), ROOTDEVICETYPE_BINDING);
            protocolMarshaller.marshall(instance.getRootDeviceVolumeId(), ROOTDEVICEVOLUMEID_BINDING);
            protocolMarshaller.marshall(instance.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(instance.getSshHostDsaKeyFingerprint(), SSHHOSTDSAKEYFINGERPRINT_BINDING);
            protocolMarshaller.marshall(instance.getSshHostRsaKeyFingerprint(), SSHHOSTRSAKEYFINGERPRINT_BINDING);
            protocolMarshaller.marshall(instance.getSshKeyName(), SSHKEYNAME_BINDING);
            protocolMarshaller.marshall(instance.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(instance.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(instance.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(instance.getTenancy(), TENANCY_BINDING);
            protocolMarshaller.marshall(instance.getVirtualizationType(), VIRTUALIZATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
