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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateInstanceRequest Marshaller
 */
public class CreateInstanceRequestMarshaller implements Marshaller<Request<CreateInstanceRequest>, CreateInstanceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateInstanceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateInstanceRequest> marshall(CreateInstanceRequest createInstanceRequest) {

        if (createInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceRequest> request = new DefaultRequest<CreateInstanceRequest>(createInstanceRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createInstanceRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(createInstanceRequest.getStackId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) createInstanceRequest.getLayerIds();
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
            if (createInstanceRequest.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(createInstanceRequest.getInstanceType());
            }
            if (createInstanceRequest.getAutoScalingType() != null) {
                jsonGenerator.writeFieldName("AutoScalingType").writeValue(createInstanceRequest.getAutoScalingType());
            }
            if (createInstanceRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("Hostname").writeValue(createInstanceRequest.getHostname());
            }
            if (createInstanceRequest.getOs() != null) {
                jsonGenerator.writeFieldName("Os").writeValue(createInstanceRequest.getOs());
            }
            if (createInstanceRequest.getAmiId() != null) {
                jsonGenerator.writeFieldName("AmiId").writeValue(createInstanceRequest.getAmiId());
            }
            if (createInstanceRequest.getSshKeyName() != null) {
                jsonGenerator.writeFieldName("SshKeyName").writeValue(createInstanceRequest.getSshKeyName());
            }
            if (createInstanceRequest.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(createInstanceRequest.getAvailabilityZone());
            }
            if (createInstanceRequest.getVirtualizationType() != null) {
                jsonGenerator.writeFieldName("VirtualizationType").writeValue(createInstanceRequest.getVirtualizationType());
            }
            if (createInstanceRequest.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(createInstanceRequest.getSubnetId());
            }
            if (createInstanceRequest.getArchitecture() != null) {
                jsonGenerator.writeFieldName("Architecture").writeValue(createInstanceRequest.getArchitecture());
            }
            if (createInstanceRequest.getRootDeviceType() != null) {
                jsonGenerator.writeFieldName("RootDeviceType").writeValue(createInstanceRequest.getRootDeviceType());
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createInstanceRequest
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
            if (createInstanceRequest.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(createInstanceRequest.getInstallUpdatesOnBoot());
            }
            if (createInstanceRequest.getEbsOptimized() != null) {
                jsonGenerator.writeFieldName("EbsOptimized").writeValue(createInstanceRequest.getEbsOptimized());
            }
            if (createInstanceRequest.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(createInstanceRequest.getAgentVersion());
            }
            if (createInstanceRequest.getTenancy() != null) {
                jsonGenerator.writeFieldName("Tenancy").writeValue(createInstanceRequest.getTenancy());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
