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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
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

            if (instance.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(instance.getFleetId());
            }
            if (instance.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(instance.getInstanceId());
            }
            if (instance.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(instance.getIpAddress());
            }
            if (instance.getOperatingSystem() != null) {
                jsonGenerator.writeFieldName("OperatingSystem").writeValue(instance.getOperatingSystem());
            }
            if (instance.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(instance.getType());
            }
            if (instance.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(instance.getStatus());
            }
            if (instance.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(instance.getCreationTime());
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
