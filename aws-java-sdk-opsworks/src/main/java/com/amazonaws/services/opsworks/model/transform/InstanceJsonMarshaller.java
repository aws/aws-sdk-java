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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceMarshaller
 */
public class InstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Instance instance, StructuredJsonGenerator jsonGenerator) {

        if (instance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instance.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(instance.getAgentVersion());
            }
            if (instance.getAmiId() != null) {
                jsonGenerator.writeFieldName("AmiId").writeValue(instance.getAmiId());
            }
            if (instance.getArchitecture() != null) {
                jsonGenerator.writeFieldName("Architecture").writeValue(instance.getArchitecture());
            }
            if (instance.getAutoScalingType() != null) {
                jsonGenerator.writeFieldName("AutoScalingType").writeValue(instance.getAutoScalingType());
            }
            if (instance.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(instance.getAvailabilityZone());
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) instance
                    .getBlockDeviceMappings();
            if (!blockDeviceMappingsList.isEmpty() || !blockDeviceMappingsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("BlockDeviceMappings");
                jsonGenerator.writeStartArray();
                for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                    if (blockDeviceMappingsListValue != null) {

                        BlockDeviceMappingJsonMarshaller.getInstance().marshall(blockDeviceMappingsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instance.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(instance.getCreatedAt());
            }
            if (instance.getEbsOptimized() != null) {
                jsonGenerator.writeFieldName("EbsOptimized").writeValue(instance.getEbsOptimized());
            }
            if (instance.getEc2InstanceId() != null) {
                jsonGenerator.writeFieldName("Ec2InstanceId").writeValue(instance.getEc2InstanceId());
            }
            if (instance.getEcsClusterArn() != null) {
                jsonGenerator.writeFieldName("EcsClusterArn").writeValue(instance.getEcsClusterArn());
            }
            if (instance.getEcsContainerInstanceArn() != null) {
                jsonGenerator.writeFieldName("EcsContainerInstanceArn").writeValue(instance.getEcsContainerInstanceArn());
            }
            if (instance.getElasticIp() != null) {
                jsonGenerator.writeFieldName("ElasticIp").writeValue(instance.getElasticIp());
            }
            if (instance.getHostname() != null) {
                jsonGenerator.writeFieldName("Hostname").writeValue(instance.getHostname());
            }
            if (instance.getInfrastructureClass() != null) {
                jsonGenerator.writeFieldName("InfrastructureClass").writeValue(instance.getInfrastructureClass());
            }
            if (instance.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(instance.getInstallUpdatesOnBoot());
            }
            if (instance.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(instance.getInstanceId());
            }
            if (instance.getInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("InstanceProfileArn").writeValue(instance.getInstanceProfileArn());
            }
            if (instance.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(instance.getInstanceType());
            }
            if (instance.getLastServiceErrorId() != null) {
                jsonGenerator.writeFieldName("LastServiceErrorId").writeValue(instance.getLastServiceErrorId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) instance.getLayerIds();
            if (!layerIdsList.isEmpty() || !layerIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("LayerIds");
                jsonGenerator.writeStartArray();
                for (String layerIdsListValue : layerIdsList) {
                    if (layerIdsListValue != null) {
                        jsonGenerator.writeValue(layerIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instance.getOs() != null) {
                jsonGenerator.writeFieldName("Os").writeValue(instance.getOs());
            }
            if (instance.getPlatform() != null) {
                jsonGenerator.writeFieldName("Platform").writeValue(instance.getPlatform());
            }
            if (instance.getPrivateDns() != null) {
                jsonGenerator.writeFieldName("PrivateDns").writeValue(instance.getPrivateDns());
            }
            if (instance.getPrivateIp() != null) {
                jsonGenerator.writeFieldName("PrivateIp").writeValue(instance.getPrivateIp());
            }
            if (instance.getPublicDns() != null) {
                jsonGenerator.writeFieldName("PublicDns").writeValue(instance.getPublicDns());
            }
            if (instance.getPublicIp() != null) {
                jsonGenerator.writeFieldName("PublicIp").writeValue(instance.getPublicIp());
            }
            if (instance.getRegisteredBy() != null) {
                jsonGenerator.writeFieldName("RegisteredBy").writeValue(instance.getRegisteredBy());
            }
            if (instance.getReportedAgentVersion() != null) {
                jsonGenerator.writeFieldName("ReportedAgentVersion").writeValue(instance.getReportedAgentVersion());
            }
            if (instance.getReportedOs() != null) {
                jsonGenerator.writeFieldName("ReportedOs");
                ReportedOsJsonMarshaller.getInstance().marshall(instance.getReportedOs(), jsonGenerator);
            }
            if (instance.getRootDeviceType() != null) {
                jsonGenerator.writeFieldName("RootDeviceType").writeValue(instance.getRootDeviceType());
            }
            if (instance.getRootDeviceVolumeId() != null) {
                jsonGenerator.writeFieldName("RootDeviceVolumeId").writeValue(instance.getRootDeviceVolumeId());
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) instance
                    .getSecurityGroupIds();
            if (!securityGroupIdsList.isEmpty() || !securityGroupIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SecurityGroupIds");
                jsonGenerator.writeStartArray();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(securityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instance.getSshHostDsaKeyFingerprint() != null) {
                jsonGenerator.writeFieldName("SshHostDsaKeyFingerprint").writeValue(instance.getSshHostDsaKeyFingerprint());
            }
            if (instance.getSshHostRsaKeyFingerprint() != null) {
                jsonGenerator.writeFieldName("SshHostRsaKeyFingerprint").writeValue(instance.getSshHostRsaKeyFingerprint());
            }
            if (instance.getSshKeyName() != null) {
                jsonGenerator.writeFieldName("SshKeyName").writeValue(instance.getSshKeyName());
            }
            if (instance.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(instance.getStackId());
            }
            if (instance.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(instance.getStatus());
            }
            if (instance.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(instance.getSubnetId());
            }
            if (instance.getTenancy() != null) {
                jsonGenerator.writeFieldName("Tenancy").writeValue(instance.getTenancy());
            }
            if (instance.getVirtualizationType() != null) {
                jsonGenerator.writeFieldName("VirtualizationType").writeValue(instance.getVirtualizationType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }

}
