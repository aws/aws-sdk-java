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
 * UpdateStackRequest Marshaller
 */
public class UpdateStackRequestMarshaller implements Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateStackRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateStackRequest> marshall(UpdateStackRequest updateStackRequest) {

        if (updateStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(updateStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateStackRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(updateStackRequest.getStackId());
            }
            if (updateStackRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateStackRequest.getName());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) updateStackRequest
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
            if (updateStackRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(updateStackRequest.getServiceRoleArn());
            }
            if (updateStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("DefaultInstanceProfileArn").writeValue(updateStackRequest.getDefaultInstanceProfileArn());
            }
            if (updateStackRequest.getDefaultOs() != null) {
                jsonGenerator.writeFieldName("DefaultOs").writeValue(updateStackRequest.getDefaultOs());
            }
            if (updateStackRequest.getHostnameTheme() != null) {
                jsonGenerator.writeFieldName("HostnameTheme").writeValue(updateStackRequest.getHostnameTheme());
            }
            if (updateStackRequest.getDefaultAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("DefaultAvailabilityZone").writeValue(updateStackRequest.getDefaultAvailabilityZone());
            }
            if (updateStackRequest.getDefaultSubnetId() != null) {
                jsonGenerator.writeFieldName("DefaultSubnetId").writeValue(updateStackRequest.getDefaultSubnetId());
            }
            if (updateStackRequest.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(updateStackRequest.getCustomJson());
            }
            if (updateStackRequest.getConfigurationManager() != null) {
                jsonGenerator.writeFieldName("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(updateStackRequest.getConfigurationManager(), jsonGenerator);
            }
            if (updateStackRequest.getChefConfiguration() != null) {
                jsonGenerator.writeFieldName("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(updateStackRequest.getChefConfiguration(), jsonGenerator);
            }
            if (updateStackRequest.getUseCustomCookbooks() != null) {
                jsonGenerator.writeFieldName("UseCustomCookbooks").writeValue(updateStackRequest.getUseCustomCookbooks());
            }
            if (updateStackRequest.getCustomCookbooksSource() != null) {
                jsonGenerator.writeFieldName("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(updateStackRequest.getCustomCookbooksSource(), jsonGenerator);
            }
            if (updateStackRequest.getDefaultSshKeyName() != null) {
                jsonGenerator.writeFieldName("DefaultSshKeyName").writeValue(updateStackRequest.getDefaultSshKeyName());
            }
            if (updateStackRequest.getDefaultRootDeviceType() != null) {
                jsonGenerator.writeFieldName("DefaultRootDeviceType").writeValue(updateStackRequest.getDefaultRootDeviceType());
            }
            if (updateStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonGenerator.writeFieldName("UseOpsworksSecurityGroups").writeValue(updateStackRequest.getUseOpsworksSecurityGroups());
            }
            if (updateStackRequest.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(updateStackRequest.getAgentVersion());
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
