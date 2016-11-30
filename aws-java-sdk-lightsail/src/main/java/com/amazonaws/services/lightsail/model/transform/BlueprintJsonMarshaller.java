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
 * BlueprintMarshaller
 */
public class BlueprintJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Blueprint blueprint, StructuredJsonGenerator jsonGenerator) {

        if (blueprint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (blueprint.getBlueprintId() != null) {
                jsonGenerator.writeFieldName("blueprintId").writeValue(blueprint.getBlueprintId());
            }
            if (blueprint.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(blueprint.getName());
            }
            if (blueprint.getGroup() != null) {
                jsonGenerator.writeFieldName("group").writeValue(blueprint.getGroup());
            }
            if (blueprint.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(blueprint.getType());
            }
            if (blueprint.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(blueprint.getDescription());
            }
            if (blueprint.getIsActive() != null) {
                jsonGenerator.writeFieldName("isActive").writeValue(blueprint.getIsActive());
            }
            if (blueprint.getMinPower() != null) {
                jsonGenerator.writeFieldName("minPower").writeValue(blueprint.getMinPower());
            }
            if (blueprint.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(blueprint.getVersion());
            }
            if (blueprint.getVersionCode() != null) {
                jsonGenerator.writeFieldName("versionCode").writeValue(blueprint.getVersionCode());
            }
            if (blueprint.getProductUrl() != null) {
                jsonGenerator.writeFieldName("productUrl").writeValue(blueprint.getProductUrl());
            }
            if (blueprint.getLicenseUrl() != null) {
                jsonGenerator.writeFieldName("licenseUrl").writeValue(blueprint.getLicenseUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BlueprintJsonMarshaller instance;

    public static BlueprintJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintJsonMarshaller();
        return instance;
    }

}
