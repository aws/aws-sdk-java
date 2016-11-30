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
 * BundleMarshaller
 */
public class BundleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Bundle bundle, StructuredJsonGenerator jsonGenerator) {

        if (bundle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (bundle.getPrice() != null) {
                jsonGenerator.writeFieldName("price").writeValue(bundle.getPrice());
            }
            if (bundle.getCpuCount() != null) {
                jsonGenerator.writeFieldName("cpuCount").writeValue(bundle.getCpuCount());
            }
            if (bundle.getDiskSizeInGb() != null) {
                jsonGenerator.writeFieldName("diskSizeInGb").writeValue(bundle.getDiskSizeInGb());
            }
            if (bundle.getBundleId() != null) {
                jsonGenerator.writeFieldName("bundleId").writeValue(bundle.getBundleId());
            }
            if (bundle.getInstanceType() != null) {
                jsonGenerator.writeFieldName("instanceType").writeValue(bundle.getInstanceType());
            }
            if (bundle.getIsActive() != null) {
                jsonGenerator.writeFieldName("isActive").writeValue(bundle.getIsActive());
            }
            if (bundle.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(bundle.getName());
            }
            if (bundle.getPower() != null) {
                jsonGenerator.writeFieldName("power").writeValue(bundle.getPower());
            }
            if (bundle.getRamSizeInGb() != null) {
                jsonGenerator.writeFieldName("ramSizeInGb").writeValue(bundle.getRamSizeInGb());
            }
            if (bundle.getTransferPerMonthInGb() != null) {
                jsonGenerator.writeFieldName("transferPerMonthInGb").writeValue(bundle.getTransferPerMonthInGb());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BundleJsonMarshaller instance;

    public static BundleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BundleJsonMarshaller();
        return instance;
    }

}
