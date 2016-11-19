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
 * InstanceGroupMarshaller
 */
public class InstanceGroupJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceGroup instanceGroup, StructuredJsonGenerator jsonGenerator) {

        if (instanceGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceGroup.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(instanceGroup.getId());
            }
            if (instanceGroup.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(instanceGroup.getName());
            }
            if (instanceGroup.getMarket() != null) {
                jsonGenerator.writeFieldName("Market").writeValue(instanceGroup.getMarket());
            }
            if (instanceGroup.getInstanceGroupType() != null) {
                jsonGenerator.writeFieldName("InstanceGroupType").writeValue(instanceGroup.getInstanceGroupType());
            }
            if (instanceGroup.getBidPrice() != null) {
                jsonGenerator.writeFieldName("BidPrice").writeValue(instanceGroup.getBidPrice());
            }
            if (instanceGroup.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(instanceGroup.getInstanceType());
            }
            if (instanceGroup.getRequestedInstanceCount() != null) {
                jsonGenerator.writeFieldName("RequestedInstanceCount").writeValue(instanceGroup.getRequestedInstanceCount());
            }
            if (instanceGroup.getRunningInstanceCount() != null) {
                jsonGenerator.writeFieldName("RunningInstanceCount").writeValue(instanceGroup.getRunningInstanceCount());
            }
            if (instanceGroup.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                InstanceGroupStatusJsonMarshaller.getInstance().marshall(instanceGroup.getStatus(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) instanceGroup
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

            com.amazonaws.internal.SdkInternalList<EbsBlockDevice> ebsBlockDevicesList = (com.amazonaws.internal.SdkInternalList<EbsBlockDevice>) instanceGroup
                    .getEbsBlockDevices();
            if (!ebsBlockDevicesList.isEmpty() || !ebsBlockDevicesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EbsBlockDevices");
                jsonGenerator.writeStartArray();
                for (EbsBlockDevice ebsBlockDevicesListValue : ebsBlockDevicesList) {
                    if (ebsBlockDevicesListValue != null) {

                        EbsBlockDeviceJsonMarshaller.getInstance().marshall(ebsBlockDevicesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instanceGroup.getEbsOptimized() != null) {
                jsonGenerator.writeFieldName("EbsOptimized").writeValue(instanceGroup.getEbsOptimized());
            }
            if (instanceGroup.getShrinkPolicy() != null) {
                jsonGenerator.writeFieldName("ShrinkPolicy");
                ShrinkPolicyJsonMarshaller.getInstance().marshall(instanceGroup.getShrinkPolicy(), jsonGenerator);
            }
            if (instanceGroup.getAutoScalingPolicy() != null) {
                jsonGenerator.writeFieldName("AutoScalingPolicy");
                AutoScalingPolicyDescriptionJsonMarshaller.getInstance().marshall(instanceGroup.getAutoScalingPolicy(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceGroupJsonMarshaller instance;

    public static InstanceGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupJsonMarshaller();
        return instance;
    }

}
