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
 * StackMarshaller
 */
public class StackJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Stack stack, JSONWriter jsonWriter) {
        if (stack == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (stack.getStackId() != null) {
                jsonWriter.key("StackId").value(stack.getStackId());
            }

            if (stack.getName() != null) {
                jsonWriter.key("Name").value(stack.getName());
            }

            if (stack.getArn() != null) {
                jsonWriter.key("Arn").value(stack.getArn());
            }

            if (stack.getRegion() != null) {
                jsonWriter.key("Region").value(stack.getRegion());
            }

            if (stack.getVpcId() != null) {
                jsonWriter.key("VpcId").value(stack.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) stack
                    .getAttributes();
            if (!attributesMap.isEmpty() || !attributesMap.isAutoConstruct()) {
                jsonWriter.key("Attributes");
                jsonWriter.object();

                for (Map.Entry<String, String> attributesMapValue : attributesMap
                        .entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonWriter.key(attributesMapValue.getKey());

                        jsonWriter.value(attributesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (stack.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(
                        stack.getServiceRoleArn());
            }

            if (stack.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(
                        stack.getDefaultInstanceProfileArn());
            }

            if (stack.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(stack.getDefaultOs());
            }

            if (stack.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(stack.getHostnameTheme());
            }

            if (stack.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(
                        stack.getDefaultAvailabilityZone());
            }

            if (stack.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(
                        stack.getDefaultSubnetId());
            }

            if (stack.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(stack.getCustomJson());
            }

            if (stack.getConfigurationManager() != null) {
                jsonWriter.key("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(
                        stack.getConfigurationManager(), jsonWriter);
            }

            if (stack.getChefConfiguration() != null) {
                jsonWriter.key("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(
                        stack.getChefConfiguration(), jsonWriter);
            }

            if (stack.getUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(
                        stack.getUseCustomCookbooks());
            }

            if (stack.getUseOpsworksSecurityGroups() != null) {
                jsonWriter.key("UseOpsworksSecurityGroups").value(
                        stack.getUseOpsworksSecurityGroups());
            }

            if (stack.getCustomCookbooksSource() != null) {
                jsonWriter.key("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(
                        stack.getCustomCookbooksSource(), jsonWriter);
            }

            if (stack.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(
                        stack.getDefaultSshKeyName());
            }

            if (stack.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(stack.getCreatedAt());
            }

            if (stack.getDefaultRootDeviceType() != null) {
                jsonWriter.key("DefaultRootDeviceType").value(
                        stack.getDefaultRootDeviceType());
            }

            if (stack.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(stack.getAgentVersion());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StackJsonMarshaller instance;

    public static StackJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StackJsonMarshaller();
        return instance;
    }

}
