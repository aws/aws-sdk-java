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
 * InstanceNetworkingMarshaller
 */
public class InstanceNetworkingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceNetworking instanceNetworking, StructuredJsonGenerator jsonGenerator) {

        if (instanceNetworking == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceNetworking.getMonthlyTransfer() != null) {
                jsonGenerator.writeFieldName("monthlyTransfer");
                MonthlyTransferJsonMarshaller.getInstance().marshall(instanceNetworking.getMonthlyTransfer(), jsonGenerator);
            }

            java.util.List<InstancePortInfo> portsList = instanceNetworking.getPorts();
            if (portsList != null) {
                jsonGenerator.writeFieldName("ports");
                jsonGenerator.writeStartArray();
                for (InstancePortInfo portsListValue : portsList) {
                    if (portsListValue != null) {

                        InstancePortInfoJsonMarshaller.getInstance().marshall(portsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceNetworkingJsonMarshaller instance;

    public static InstanceNetworkingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkingJsonMarshaller();
        return instance;
    }

}
