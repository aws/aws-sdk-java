/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * InstanceMarshaller
 */
public class InstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Instance instance, JSONWriter jsonWriter) {
        if (instance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instance.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion")
                        .value(instance.getAgentVersion());
            }

            if (instance.getAmiId() != null) {
                jsonWriter.key("AmiId").value(instance.getAmiId());
            }

            if (instance.getArchitecture() != null) {
                jsonWriter.key("Architecture")
                        .value(instance.getArchitecture());
            }

            if (instance.getAutoScalingType() != null) {
                jsonWriter.key("AutoScalingType").value(
                        instance.getAutoScalingType());
            }

            if (instance.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(
                        instance.getAvailabilityZone());
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) instance
                    .getBlockDeviceMappings();
            if (!blockDeviceMappingsList.isEmpty()
                    || !blockDeviceMappingsList.isAutoConstruct()) {
                jsonWriter.key("BlockDeviceMappings");
                jsonWriter.array();
                for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                    if (blockDeviceMappingsListValue != null) {

                        BlockDeviceMappingJsonMarshaller.getInstance()
                                .marshall(blockDeviceMappingsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (instance.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(instance.getCreatedAt());
            }

            if (instance.getEbsOptimized() != null) {
                jsonWriter.key("EbsOptimized")
                        .value(instance.getEbsOptimized());
            }

            if (instance.getEc2InstanceId() != null) {
                jsonWriter.key("Ec2InstanceId").value(
                        instance.getEc2InstanceId());
            }

            if (instance.getEcsClusterArn() != null) {
                jsonWriter.key("EcsClusterArn").value(
                        instance.getEcsClusterArn());
            }

            if (instance.getEcsContainerInstanceArn() != null) {
                jsonWriter.key("EcsContainerInstanceArn").value(
                        instance.getEcsContainerInstanceArn());
            }

            if (instance.getElasticIp() != null) {
                jsonWriter.key("ElasticIp").value(instance.getElasticIp());
            }

            if (instance.getHostname() != null) {
                jsonWriter.key("Hostname").value(instance.getHostname());
            }

            if (instance.getInfrastructureClass() != null) {
                jsonWriter.key("InfrastructureClass").value(
                        instance.getInfrastructureClass());
            }

            if (instance.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        instance.getInstallUpdatesOnBoot());
            }

            if (instance.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(instance.getInstanceId());
            }

            if (instance.getInstanceProfileArn() != null) {
                jsonWriter.key("InstanceProfileArn").value(
                        instance.getInstanceProfileArn());
            }

            if (instance.getInstanceType() != null) {
                jsonWriter.key("InstanceType")
                        .value(instance.getInstanceType());
            }

            if (instance.getLastServiceErrorId() != null) {
                jsonWriter.key("LastServiceErrorId").value(
                        instance.getLastServiceErrorId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) instance
                    .getLayerIds();
            if (!layerIdsList.isEmpty() || !layerIdsList.isAutoConstruct()) {
                jsonWriter.key("LayerIds");
                jsonWriter.array();
                for (String layerIdsListValue : layerIdsList) {
                    if (layerIdsListValue != null) {
                        jsonWriter.value(layerIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (instance.getOs() != null) {
                jsonWriter.key("Os").value(instance.getOs());
            }

            if (instance.getPlatform() != null) {
                jsonWriter.key("Platform").value(instance.getPlatform());
            }

            if (instance.getPrivateDns() != null) {
                jsonWriter.key("PrivateDns").value(instance.getPrivateDns());
            }

            if (instance.getPrivateIp() != null) {
                jsonWriter.key("PrivateIp").value(instance.getPrivateIp());
            }

            if (instance.getPublicDns() != null) {
                jsonWriter.key("PublicDns").value(instance.getPublicDns());
            }

            if (instance.getPublicIp() != null) {
                jsonWriter.key("PublicIp").value(instance.getPublicIp());
            }

            if (instance.getRegisteredBy() != null) {
                jsonWriter.key("RegisteredBy")
                        .value(instance.getRegisteredBy());
            }

            if (instance.getReportedAgentVersion() != null) {
                jsonWriter.key("ReportedAgentVersion").value(
                        instance.getReportedAgentVersion());
            }

            if (instance.getReportedOs() != null) {
                jsonWriter.key("ReportedOs");
                ReportedOsJsonMarshaller.getInstance().marshall(
                        instance.getReportedOs(), jsonWriter);
            }

            if (instance.getRootDeviceType() != null) {
                jsonWriter.key("RootDeviceType").value(
                        instance.getRootDeviceType());
            }

            if (instance.getRootDeviceVolumeId() != null) {
                jsonWriter.key("RootDeviceVolumeId").value(
                        instance.getRootDeviceVolumeId());
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) instance
                    .getSecurityGroupIds();
            if (!securityGroupIdsList.isEmpty()
                    || !securityGroupIdsList.isAutoConstruct()) {
                jsonWriter.key("SecurityGroupIds");
                jsonWriter.array();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonWriter.value(securityGroupIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (instance.getSshHostDsaKeyFingerprint() != null) {
                jsonWriter.key("SshHostDsaKeyFingerprint").value(
                        instance.getSshHostDsaKeyFingerprint());
            }

            if (instance.getSshHostRsaKeyFingerprint() != null) {
                jsonWriter.key("SshHostRsaKeyFingerprint").value(
                        instance.getSshHostRsaKeyFingerprint());
            }

            if (instance.getSshKeyName() != null) {
                jsonWriter.key("SshKeyName").value(instance.getSshKeyName());
            }

            if (instance.getStackId() != null) {
                jsonWriter.key("StackId").value(instance.getStackId());
            }

            if (instance.getStatus() != null) {
                jsonWriter.key("Status").value(instance.getStatus());
            }

            if (instance.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(instance.getSubnetId());
            }

            if (instance.getVirtualizationType() != null) {
                jsonWriter.key("VirtualizationType").value(
                        instance.getVirtualizationType());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }

}
