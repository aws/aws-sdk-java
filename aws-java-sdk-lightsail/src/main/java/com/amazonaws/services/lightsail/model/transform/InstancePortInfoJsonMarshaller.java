/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.json.*;

/**
 * InstancePortInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePortInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstancePortInfo instancePortInfo, StructuredJsonGenerator jsonGenerator) {

        if (instancePortInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instancePortInfo.getFromPort() != null) {
                jsonGenerator.writeFieldName("fromPort").writeValue(instancePortInfo.getFromPort());
            }
            if (instancePortInfo.getToPort() != null) {
                jsonGenerator.writeFieldName("toPort").writeValue(instancePortInfo.getToPort());
            }
            if (instancePortInfo.getProtocol() != null) {
                jsonGenerator.writeFieldName("protocol").writeValue(instancePortInfo.getProtocol());
            }
            if (instancePortInfo.getAccessFrom() != null) {
                jsonGenerator.writeFieldName("accessFrom").writeValue(instancePortInfo.getAccessFrom());
            }
            if (instancePortInfo.getAccessType() != null) {
                jsonGenerator.writeFieldName("accessType").writeValue(instancePortInfo.getAccessType());
            }
            if (instancePortInfo.getCommonName() != null) {
                jsonGenerator.writeFieldName("commonName").writeValue(instancePortInfo.getCommonName());
            }
            if (instancePortInfo.getAccessDirection() != null) {
                jsonGenerator.writeFieldName("accessDirection").writeValue(instancePortInfo.getAccessDirection());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstancePortInfoJsonMarshaller instance;

    public static InstancePortInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancePortInfoJsonMarshaller();
        return instance;
    }

}
