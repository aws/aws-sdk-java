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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
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

            if (instance.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(instance.getName());
            }
            if (instance.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(instance.getArn());
            }
            if (instance.getSupportCode() != null) {
                jsonGenerator.writeFieldName("supportCode").writeValue(instance.getSupportCode());
            }
            if (instance.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(instance.getCreatedAt());
            }
            if (instance.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(instance.getLocation(), jsonGenerator);
            }
            if (instance.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(instance.getResourceType());
            }
            if (instance.getBlueprintId() != null) {
                jsonGenerator.writeFieldName("blueprintId").writeValue(instance.getBlueprintId());
            }
            if (instance.getBlueprintName() != null) {
                jsonGenerator.writeFieldName("blueprintName").writeValue(instance.getBlueprintName());
            }
            if (instance.getBundleId() != null) {
                jsonGenerator.writeFieldName("bundleId").writeValue(instance.getBundleId());
            }
            if (instance.getIsStaticIp() != null) {
                jsonGenerator.writeFieldName("isStaticIp").writeValue(instance.getIsStaticIp());
            }
            if (instance.getPrivateIpAddress() != null) {
                jsonGenerator.writeFieldName("privateIpAddress").writeValue(instance.getPrivateIpAddress());
            }
            if (instance.getPublicIpAddress() != null) {
                jsonGenerator.writeFieldName("publicIpAddress").writeValue(instance.getPublicIpAddress());
            }
            if (instance.getIpv6Address() != null) {
                jsonGenerator.writeFieldName("ipv6Address").writeValue(instance.getIpv6Address());
            }
            if (instance.getHardware() != null) {
                jsonGenerator.writeFieldName("hardware");
                InstanceHardwareJsonMarshaller.getInstance().marshall(instance.getHardware(), jsonGenerator);
            }
            if (instance.getNetworking() != null) {
                jsonGenerator.writeFieldName("networking");
                InstanceNetworkingJsonMarshaller.getInstance().marshall(instance.getNetworking(), jsonGenerator);
            }
            if (instance.getState() != null) {
                jsonGenerator.writeFieldName("state");
                InstanceStateJsonMarshaller.getInstance().marshall(instance.getState(), jsonGenerator);
            }
            if (instance.getUsername() != null) {
                jsonGenerator.writeFieldName("username").writeValue(instance.getUsername());
            }
            if (instance.getSshKeyName() != null) {
                jsonGenerator.writeFieldName("sshKeyName").writeValue(instance.getSshKeyName());
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
