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
 * StackMarshaller
 */
public class StackJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Stack stack, StructuredJsonGenerator jsonGenerator) {

        if (stack == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stack.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(stack.getStackId());
            }
            if (stack.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(stack.getName());
            }
            if (stack.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(stack.getArn());
            }
            if (stack.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(stack.getRegion());
            }
            if (stack.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(stack.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) stack.getAttributes();
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
            if (stack.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(stack.getServiceRoleArn());
            }
            if (stack.getDefaultInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("DefaultInstanceProfileArn").writeValue(stack.getDefaultInstanceProfileArn());
            }
            if (stack.getDefaultOs() != null) {
                jsonGenerator.writeFieldName("DefaultOs").writeValue(stack.getDefaultOs());
            }
            if (stack.getHostnameTheme() != null) {
                jsonGenerator.writeFieldName("HostnameTheme").writeValue(stack.getHostnameTheme());
            }
            if (stack.getDefaultAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("DefaultAvailabilityZone").writeValue(stack.getDefaultAvailabilityZone());
            }
            if (stack.getDefaultSubnetId() != null) {
                jsonGenerator.writeFieldName("DefaultSubnetId").writeValue(stack.getDefaultSubnetId());
            }
            if (stack.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(stack.getCustomJson());
            }
            if (stack.getConfigurationManager() != null) {
                jsonGenerator.writeFieldName("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(stack.getConfigurationManager(), jsonGenerator);
            }
            if (stack.getChefConfiguration() != null) {
                jsonGenerator.writeFieldName("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(stack.getChefConfiguration(), jsonGenerator);
            }
            if (stack.getUseCustomCookbooks() != null) {
                jsonGenerator.writeFieldName("UseCustomCookbooks").writeValue(stack.getUseCustomCookbooks());
            }
            if (stack.getUseOpsworksSecurityGroups() != null) {
                jsonGenerator.writeFieldName("UseOpsworksSecurityGroups").writeValue(stack.getUseOpsworksSecurityGroups());
            }
            if (stack.getCustomCookbooksSource() != null) {
                jsonGenerator.writeFieldName("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(stack.getCustomCookbooksSource(), jsonGenerator);
            }
            if (stack.getDefaultSshKeyName() != null) {
                jsonGenerator.writeFieldName("DefaultSshKeyName").writeValue(stack.getDefaultSshKeyName());
            }
            if (stack.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(stack.getCreatedAt());
            }
            if (stack.getDefaultRootDeviceType() != null) {
                jsonGenerator.writeFieldName("DefaultRootDeviceType").writeValue(stack.getDefaultRootDeviceType());
            }
            if (stack.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(stack.getAgentVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StackJsonMarshaller instance;

    public static StackJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StackJsonMarshaller();
        return instance;
    }

}
