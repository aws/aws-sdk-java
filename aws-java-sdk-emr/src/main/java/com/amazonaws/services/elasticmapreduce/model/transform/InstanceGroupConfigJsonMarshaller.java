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
 * InstanceGroupConfigMarshaller
 */
public class InstanceGroupConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceGroupConfig instanceGroupConfig, StructuredJsonGenerator jsonGenerator) {

        if (instanceGroupConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceGroupConfig.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(instanceGroupConfig.getName());
            }
            if (instanceGroupConfig.getMarket() != null) {
                jsonGenerator.writeFieldName("Market").writeValue(instanceGroupConfig.getMarket());
            }
            if (instanceGroupConfig.getInstanceRole() != null) {
                jsonGenerator.writeFieldName("InstanceRole").writeValue(instanceGroupConfig.getInstanceRole());
            }
            if (instanceGroupConfig.getBidPrice() != null) {
                jsonGenerator.writeFieldName("BidPrice").writeValue(instanceGroupConfig.getBidPrice());
            }
            if (instanceGroupConfig.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(instanceGroupConfig.getInstanceType());
            }
            if (instanceGroupConfig.getInstanceCount() != null) {
                jsonGenerator.writeFieldName("InstanceCount").writeValue(instanceGroupConfig.getInstanceCount());
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) instanceGroupConfig
                    .getConfigurations();
            if (!configurationsList.isEmpty() || !configurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Configurations");
                jsonGenerator.writeStartArray();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instanceGroupConfig.getEbsConfiguration() != null) {
                jsonGenerator.writeFieldName("EbsConfiguration");
                EbsConfigurationJsonMarshaller.getInstance().marshall(instanceGroupConfig.getEbsConfiguration(), jsonGenerator);
            }
            if (instanceGroupConfig.getAutoScalingPolicy() != null) {
                jsonGenerator.writeFieldName("AutoScalingPolicy");
                AutoScalingPolicyJsonMarshaller.getInstance().marshall(instanceGroupConfig.getAutoScalingPolicy(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceGroupConfigJsonMarshaller instance;

    public static InstanceGroupConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupConfigJsonMarshaller();
        return instance;
    }

}
