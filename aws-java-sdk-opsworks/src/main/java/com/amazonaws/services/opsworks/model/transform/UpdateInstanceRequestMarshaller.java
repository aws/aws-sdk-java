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
 * UpdateInstanceRequest Marshaller
 */
public class UpdateInstanceRequestMarshaller implements Marshaller<Request<UpdateInstanceRequest>, UpdateInstanceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateInstanceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateInstanceRequest> marshall(UpdateInstanceRequest updateInstanceRequest) {

        if (updateInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateInstanceRequest> request = new DefaultRequest<UpdateInstanceRequest>(updateInstanceRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateInstanceRequest.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(updateInstanceRequest.getInstanceId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) updateInstanceRequest.getLayerIds();
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
            if (updateInstanceRequest.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(updateInstanceRequest.getInstanceType());
            }
            if (updateInstanceRequest.getAutoScalingType() != null) {
                jsonGenerator.writeFieldName("AutoScalingType").writeValue(updateInstanceRequest.getAutoScalingType());
            }
            if (updateInstanceRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("Hostname").writeValue(updateInstanceRequest.getHostname());
            }
            if (updateInstanceRequest.getOs() != null) {
                jsonGenerator.writeFieldName("Os").writeValue(updateInstanceRequest.getOs());
            }
            if (updateInstanceRequest.getAmiId() != null) {
                jsonGenerator.writeFieldName("AmiId").writeValue(updateInstanceRequest.getAmiId());
            }
            if (updateInstanceRequest.getSshKeyName() != null) {
                jsonGenerator.writeFieldName("SshKeyName").writeValue(updateInstanceRequest.getSshKeyName());
            }
            if (updateInstanceRequest.getArchitecture() != null) {
                jsonGenerator.writeFieldName("Architecture").writeValue(updateInstanceRequest.getArchitecture());
            }
            if (updateInstanceRequest.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(updateInstanceRequest.getInstallUpdatesOnBoot());
            }
            if (updateInstanceRequest.getEbsOptimized() != null) {
                jsonGenerator.writeFieldName("EbsOptimized").writeValue(updateInstanceRequest.getEbsOptimized());
            }
            if (updateInstanceRequest.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(updateInstanceRequest.getAgentVersion());
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
