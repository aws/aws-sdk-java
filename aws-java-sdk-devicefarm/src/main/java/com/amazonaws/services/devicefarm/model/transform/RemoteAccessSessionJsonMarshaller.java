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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RemoteAccessSessionMarshaller
 */
public class RemoteAccessSessionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RemoteAccessSession remoteAccessSession, StructuredJsonGenerator jsonGenerator) {

        if (remoteAccessSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (remoteAccessSession.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(remoteAccessSession.getArn());
            }
            if (remoteAccessSession.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(remoteAccessSession.getName());
            }
            if (remoteAccessSession.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(remoteAccessSession.getCreated());
            }
            if (remoteAccessSession.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(remoteAccessSession.getStatus());
            }
            if (remoteAccessSession.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(remoteAccessSession.getResult());
            }
            if (remoteAccessSession.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(remoteAccessSession.getMessage());
            }
            if (remoteAccessSession.getStarted() != null) {
                jsonGenerator.writeFieldName("started").writeValue(remoteAccessSession.getStarted());
            }
            if (remoteAccessSession.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(remoteAccessSession.getStopped());
            }
            if (remoteAccessSession.getDevice() != null) {
                jsonGenerator.writeFieldName("device");
                DeviceJsonMarshaller.getInstance().marshall(remoteAccessSession.getDevice(), jsonGenerator);
            }
            if (remoteAccessSession.getBillingMethod() != null) {
                jsonGenerator.writeFieldName("billingMethod").writeValue(remoteAccessSession.getBillingMethod());
            }
            if (remoteAccessSession.getDeviceMinutes() != null) {
                jsonGenerator.writeFieldName("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(remoteAccessSession.getDeviceMinutes(), jsonGenerator);
            }
            if (remoteAccessSession.getEndpoint() != null) {
                jsonGenerator.writeFieldName("endpoint").writeValue(remoteAccessSession.getEndpoint());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RemoteAccessSessionJsonMarshaller instance;

    public static RemoteAccessSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RemoteAccessSessionJsonMarshaller();
        return instance;
    }

}
