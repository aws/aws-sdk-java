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
 * InstanceGroupDetailMarshaller
 */
public class InstanceGroupDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceGroupDetail instanceGroupDetail, StructuredJsonGenerator jsonGenerator) {

        if (instanceGroupDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceGroupDetail.getInstanceGroupId() != null) {
                jsonGenerator.writeFieldName("InstanceGroupId").writeValue(instanceGroupDetail.getInstanceGroupId());
            }
            if (instanceGroupDetail.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(instanceGroupDetail.getName());
            }
            if (instanceGroupDetail.getMarket() != null) {
                jsonGenerator.writeFieldName("Market").writeValue(instanceGroupDetail.getMarket());
            }
            if (instanceGroupDetail.getInstanceRole() != null) {
                jsonGenerator.writeFieldName("InstanceRole").writeValue(instanceGroupDetail.getInstanceRole());
            }
            if (instanceGroupDetail.getBidPrice() != null) {
                jsonGenerator.writeFieldName("BidPrice").writeValue(instanceGroupDetail.getBidPrice());
            }
            if (instanceGroupDetail.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(instanceGroupDetail.getInstanceType());
            }
            if (instanceGroupDetail.getInstanceRequestCount() != null) {
                jsonGenerator.writeFieldName("InstanceRequestCount").writeValue(instanceGroupDetail.getInstanceRequestCount());
            }
            if (instanceGroupDetail.getInstanceRunningCount() != null) {
                jsonGenerator.writeFieldName("InstanceRunningCount").writeValue(instanceGroupDetail.getInstanceRunningCount());
            }
            if (instanceGroupDetail.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(instanceGroupDetail.getState());
            }
            if (instanceGroupDetail.getLastStateChangeReason() != null) {
                jsonGenerator.writeFieldName("LastStateChangeReason").writeValue(instanceGroupDetail.getLastStateChangeReason());
            }
            if (instanceGroupDetail.getCreationDateTime() != null) {
                jsonGenerator.writeFieldName("CreationDateTime").writeValue(instanceGroupDetail.getCreationDateTime());
            }
            if (instanceGroupDetail.getStartDateTime() != null) {
                jsonGenerator.writeFieldName("StartDateTime").writeValue(instanceGroupDetail.getStartDateTime());
            }
            if (instanceGroupDetail.getReadyDateTime() != null) {
                jsonGenerator.writeFieldName("ReadyDateTime").writeValue(instanceGroupDetail.getReadyDateTime());
            }
            if (instanceGroupDetail.getEndDateTime() != null) {
                jsonGenerator.writeFieldName("EndDateTime").writeValue(instanceGroupDetail.getEndDateTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceGroupDetailJsonMarshaller instance;

    public static InstanceGroupDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupDetailJsonMarshaller();
        return instance;
    }

}
