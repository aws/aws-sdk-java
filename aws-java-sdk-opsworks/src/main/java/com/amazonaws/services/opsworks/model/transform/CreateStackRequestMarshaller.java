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
 * CreateStackRequest Marshaller
 */
public class CreateStackRequestMarshaller implements Marshaller<Request<CreateStackRequest>, CreateStackRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateStackRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateStackRequest> marshall(CreateStackRequest createStackRequest) {

        if (createStackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStackRequest> request = new DefaultRequest<CreateStackRequest>(createStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createStackRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createStackRequest.getName());
            }
            if (createStackRequest.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(createStackRequest.getRegion());
            }
            if (createStackRequest.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(createStackRequest.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createStackRequest
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
            if (createStackRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(createStackRequest.getServiceRoleArn());
            }
            if (createStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("DefaultInstanceProfileArn").writeValue(createStackRequest.getDefaultInstanceProfileArn());
            }
            if (createStackRequest.getDefaultOs() != null) {
                jsonGenerator.writeFieldName("DefaultOs").writeValue(createStackRequest.getDefaultOs());
            }
            if (createStackRequest.getHostnameTheme() != null) {
                jsonGenerator.writeFieldName("HostnameTheme").writeValue(createStackRequest.getHostnameTheme());
            }
            if (createStackRequest.getDefaultAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("DefaultAvailabilityZone").writeValue(createStackRequest.getDefaultAvailabilityZone());
            }
            if (createStackRequest.getDefaultSubnetId() != null) {
                jsonGenerator.writeFieldName("DefaultSubnetId").writeValue(createStackRequest.getDefaultSubnetId());
            }
            if (createStackRequest.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(createStackRequest.getCustomJson());
            }
            if (createStackRequest.getConfigurationManager() != null) {
                jsonGenerator.writeFieldName("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(createStackRequest.getConfigurationManager(), jsonGenerator);
            }
            if (createStackRequest.getChefConfiguration() != null) {
                jsonGenerator.writeFieldName("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(createStackRequest.getChefConfiguration(), jsonGenerator);
            }
            if (createStackRequest.getUseCustomCookbooks() != null) {
                jsonGenerator.writeFieldName("UseCustomCookbooks").writeValue(createStackRequest.getUseCustomCookbooks());
            }
            if (createStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonGenerator.writeFieldName("UseOpsworksSecurityGroups").writeValue(createStackRequest.getUseOpsworksSecurityGroups());
            }
            if (createStackRequest.getCustomCookbooksSource() != null) {
                jsonGenerator.writeFieldName("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(createStackRequest.getCustomCookbooksSource(), jsonGenerator);
            }
            if (createStackRequest.getDefaultSshKeyName() != null) {
                jsonGenerator.writeFieldName("DefaultSshKeyName").writeValue(createStackRequest.getDefaultSshKeyName());
            }
            if (createStackRequest.getDefaultRootDeviceType() != null) {
                jsonGenerator.writeFieldName("DefaultRootDeviceType").writeValue(createStackRequest.getDefaultRootDeviceType());
            }
            if (createStackRequest.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(createStackRequest.getAgentVersion());
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
