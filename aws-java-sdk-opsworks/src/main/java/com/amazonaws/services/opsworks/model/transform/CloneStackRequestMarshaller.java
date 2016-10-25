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
 * CloneStackRequest Marshaller
 */
public class CloneStackRequestMarshaller implements Marshaller<Request<CloneStackRequest>, CloneStackRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CloneStackRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CloneStackRequest> marshall(CloneStackRequest cloneStackRequest) {

        if (cloneStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CloneStackRequest> request = new DefaultRequest<CloneStackRequest>(cloneStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CloneStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (cloneStackRequest.getSourceStackId() != null) {
                jsonGenerator.writeFieldName("SourceStackId").writeValue(cloneStackRequest.getSourceStackId());
            }
            if (cloneStackRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(cloneStackRequest.getName());
            }
            if (cloneStackRequest.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(cloneStackRequest.getRegion());
            }
            if (cloneStackRequest.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(cloneStackRequest.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) cloneStackRequest
                    .getAttributes();
            if (!attributesMap.isEmpty() || !attributesMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> attributesMapValue : attributesMap.entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(attributesMapValue.getKey());

                        jsonGenerator.writeValue(attributesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (cloneStackRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(cloneStackRequest.getServiceRoleArn());
            }
            if (cloneStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("DefaultInstanceProfileArn").writeValue(cloneStackRequest.getDefaultInstanceProfileArn());
            }
            if (cloneStackRequest.getDefaultOs() != null) {
                jsonGenerator.writeFieldName("DefaultOs").writeValue(cloneStackRequest.getDefaultOs());
            }
            if (cloneStackRequest.getHostnameTheme() != null) {
                jsonGenerator.writeFieldName("HostnameTheme").writeValue(cloneStackRequest.getHostnameTheme());
            }
            if (cloneStackRequest.getDefaultAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("DefaultAvailabilityZone").writeValue(cloneStackRequest.getDefaultAvailabilityZone());
            }
            if (cloneStackRequest.getDefaultSubnetId() != null) {
                jsonGenerator.writeFieldName("DefaultSubnetId").writeValue(cloneStackRequest.getDefaultSubnetId());
            }
            if (cloneStackRequest.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(cloneStackRequest.getCustomJson());
            }
            if (cloneStackRequest.getConfigurationManager() != null) {
                jsonGenerator.writeFieldName("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(cloneStackRequest.getConfigurationManager(), jsonGenerator);
            }
            if (cloneStackRequest.getChefConfiguration() != null) {
                jsonGenerator.writeFieldName("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(cloneStackRequest.getChefConfiguration(), jsonGenerator);
            }
            if (cloneStackRequest.getUseCustomCookbooks() != null) {
                jsonGenerator.writeFieldName("UseCustomCookbooks").writeValue(cloneStackRequest.getUseCustomCookbooks());
            }
            if (cloneStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonGenerator.writeFieldName("UseOpsworksSecurityGroups").writeValue(cloneStackRequest.getUseOpsworksSecurityGroups());
            }
            if (cloneStackRequest.getCustomCookbooksSource() != null) {
                jsonGenerator.writeFieldName("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(cloneStackRequest.getCustomCookbooksSource(), jsonGenerator);
            }
            if (cloneStackRequest.getDefaultSshKeyName() != null) {
                jsonGenerator.writeFieldName("DefaultSshKeyName").writeValue(cloneStackRequest.getDefaultSshKeyName());
            }
            if (cloneStackRequest.getClonePermissions() != null) {
                jsonGenerator.writeFieldName("ClonePermissions").writeValue(cloneStackRequest.getClonePermissions());
            }

            com.amazonaws.internal.SdkInternalList<String> cloneAppIdsList = (com.amazonaws.internal.SdkInternalList<String>) cloneStackRequest
                    .getCloneAppIds();
            if (!cloneAppIdsList.isEmpty() || !cloneAppIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CloneAppIds");
                jsonGenerator.writeStartArray();
                for (String cloneAppIdsListValue : cloneAppIdsList) {
                    if (cloneAppIdsListValue != null) {
                        jsonGenerator.writeValue(cloneAppIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (cloneStackRequest.getDefaultRootDeviceType() != null) {
                jsonGenerator.writeFieldName("DefaultRootDeviceType").writeValue(cloneStackRequest.getDefaultRootDeviceType());
            }
            if (cloneStackRequest.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(cloneStackRequest.getAgentVersion());
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
