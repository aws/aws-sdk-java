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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateInstanceRequest Marshaller
 */
public class CreateInstanceRequestMarshaller implements
        Marshaller<Request<CreateInstanceRequest>, CreateInstanceRequest> {

    public Request<CreateInstanceRequest> marshall(
            CreateInstanceRequest createInstanceRequest) {

        if (createInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceRequest> request = new DefaultRequest<CreateInstanceRequest>(
                createInstanceRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createInstanceRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(
                        createInstanceRequest.getStackId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) createInstanceRequest
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

            if (createInstanceRequest.getInstanceType() != null) {
                jsonWriter.key("InstanceType").value(
                        createInstanceRequest.getInstanceType());
            }

            if (createInstanceRequest.getAutoScalingType() != null) {
                jsonWriter.key("AutoScalingType").value(
                        createInstanceRequest.getAutoScalingType());
            }

            if (createInstanceRequest.getHostname() != null) {
                jsonWriter.key("Hostname").value(
                        createInstanceRequest.getHostname());
            }

            if (createInstanceRequest.getOs() != null) {
                jsonWriter.key("Os").value(createInstanceRequest.getOs());
            }

            if (createInstanceRequest.getAmiId() != null) {
                jsonWriter.key("AmiId").value(createInstanceRequest.getAmiId());
            }

            if (createInstanceRequest.getSshKeyName() != null) {
                jsonWriter.key("SshKeyName").value(
                        createInstanceRequest.getSshKeyName());
            }

            if (createInstanceRequest.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(
                        createInstanceRequest.getAvailabilityZone());
            }

            if (createInstanceRequest.getVirtualizationType() != null) {
                jsonWriter.key("VirtualizationType").value(
                        createInstanceRequest.getVirtualizationType());
            }

            if (createInstanceRequest.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(
                        createInstanceRequest.getSubnetId());
            }

            if (createInstanceRequest.getArchitecture() != null) {
                jsonWriter.key("Architecture").value(
                        createInstanceRequest.getArchitecture());
            }

            if (createInstanceRequest.getRootDeviceType() != null) {
                jsonWriter.key("RootDeviceType").value(
                        createInstanceRequest.getRootDeviceType());
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) createInstanceRequest
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

            if (createInstanceRequest.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        createInstanceRequest.getInstallUpdatesOnBoot());
            }

            if (createInstanceRequest.getEbsOptimized() != null) {
                jsonWriter.key("EbsOptimized").value(
                        createInstanceRequest.getEbsOptimized());
            }

            if (createInstanceRequest.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        createInstanceRequest.getAgentVersion());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
