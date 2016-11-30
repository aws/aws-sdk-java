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
 * InstanceAccessDetailsMarshaller
 */
public class InstanceAccessDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceAccessDetails instanceAccessDetails, StructuredJsonGenerator jsonGenerator) {

        if (instanceAccessDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceAccessDetails.getCertKey() != null) {
                jsonGenerator.writeFieldName("certKey").writeValue(instanceAccessDetails.getCertKey());
            }
            if (instanceAccessDetails.getExpiresAt() != null) {
                jsonGenerator.writeFieldName("expiresAt").writeValue(instanceAccessDetails.getExpiresAt());
            }
            if (instanceAccessDetails.getIpAddress() != null) {
                jsonGenerator.writeFieldName("ipAddress").writeValue(instanceAccessDetails.getIpAddress());
            }
            if (instanceAccessDetails.getPassword() != null) {
                jsonGenerator.writeFieldName("password").writeValue(instanceAccessDetails.getPassword());
            }
            if (instanceAccessDetails.getPrivateKey() != null) {
                jsonGenerator.writeFieldName("privateKey").writeValue(instanceAccessDetails.getPrivateKey());
            }
            if (instanceAccessDetails.getProtocol() != null) {
                jsonGenerator.writeFieldName("protocol").writeValue(instanceAccessDetails.getProtocol());
            }
            if (instanceAccessDetails.getInstanceName() != null) {
                jsonGenerator.writeFieldName("instanceName").writeValue(instanceAccessDetails.getInstanceName());
            }
            if (instanceAccessDetails.getUsername() != null) {
                jsonGenerator.writeFieldName("username").writeValue(instanceAccessDetails.getUsername());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceAccessDetailsJsonMarshaller instance;

    public static InstanceAccessDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAccessDetailsJsonMarshaller();
        return instance;
    }

}
