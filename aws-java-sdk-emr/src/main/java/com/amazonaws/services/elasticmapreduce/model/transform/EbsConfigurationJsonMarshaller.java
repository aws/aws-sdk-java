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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EbsConfigurationMarshaller
 */
public class EbsConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EbsConfiguration ebsConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (ebsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig> ebsBlockDeviceConfigsList = (com.amazonaws.internal.SdkInternalList<EbsBlockDeviceConfig>) ebsConfiguration
                    .getEbsBlockDeviceConfigs();
            if (!ebsBlockDeviceConfigsList.isEmpty() || !ebsBlockDeviceConfigsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EbsBlockDeviceConfigs");
                jsonGenerator.writeStartArray();
                for (EbsBlockDeviceConfig ebsBlockDeviceConfigsListValue : ebsBlockDeviceConfigsList) {
                    if (ebsBlockDeviceConfigsListValue != null) {

                        EbsBlockDeviceConfigJsonMarshaller.getInstance().marshall(ebsBlockDeviceConfigsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (ebsConfiguration.getEbsOptimized() != null) {
                jsonGenerator.writeFieldName("EbsOptimized").writeValue(ebsConfiguration.getEbsOptimized());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EbsConfigurationJsonMarshaller instance;

    public static EbsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsConfigurationJsonMarshaller();
        return instance;
    }

}
