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
 * AccountSettingsMarshaller
 */
public class AccountSettingsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AccountSettings accountSettings, StructuredJsonGenerator jsonGenerator) {

        if (accountSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (accountSettings.getAwsAccountNumber() != null) {
                jsonGenerator.writeFieldName("awsAccountNumber").writeValue(accountSettings.getAwsAccountNumber());
            }

            java.util.Map<String, Integer> unmeteredDevicesMap = accountSettings.getUnmeteredDevices();
            if (unmeteredDevicesMap != null) {
                jsonGenerator.writeFieldName("unmeteredDevices");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Integer> unmeteredDevicesMapValue : unmeteredDevicesMap.entrySet()) {
                    if (unmeteredDevicesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(unmeteredDevicesMapValue.getKey());

                        jsonGenerator.writeValue(unmeteredDevicesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, Integer> unmeteredRemoteAccessDevicesMap = accountSettings.getUnmeteredRemoteAccessDevices();
            if (unmeteredRemoteAccessDevicesMap != null) {
                jsonGenerator.writeFieldName("unmeteredRemoteAccessDevices");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Integer> unmeteredRemoteAccessDevicesMapValue : unmeteredRemoteAccessDevicesMap.entrySet()) {
                    if (unmeteredRemoteAccessDevicesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(unmeteredRemoteAccessDevicesMapValue.getKey());

                        jsonGenerator.writeValue(unmeteredRemoteAccessDevicesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AccountSettingsJsonMarshaller instance;

    public static AccountSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountSettingsJsonMarshaller();
        return instance;
    }

}
