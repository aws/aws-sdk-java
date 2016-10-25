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
 * ScheduleRunConfigurationMarshaller
 */
public class ScheduleRunConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScheduleRunConfiguration scheduleRunConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (scheduleRunConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scheduleRunConfiguration.getExtraDataPackageArn() != null) {
                jsonGenerator.writeFieldName("extraDataPackageArn").writeValue(scheduleRunConfiguration.getExtraDataPackageArn());
            }
            if (scheduleRunConfiguration.getNetworkProfileArn() != null) {
                jsonGenerator.writeFieldName("networkProfileArn").writeValue(scheduleRunConfiguration.getNetworkProfileArn());
            }
            if (scheduleRunConfiguration.getLocale() != null) {
                jsonGenerator.writeFieldName("locale").writeValue(scheduleRunConfiguration.getLocale());
            }
            if (scheduleRunConfiguration.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                LocationJsonMarshaller.getInstance().marshall(scheduleRunConfiguration.getLocation(), jsonGenerator);
            }
            if (scheduleRunConfiguration.getRadios() != null) {
                jsonGenerator.writeFieldName("radios");
                RadiosJsonMarshaller.getInstance().marshall(scheduleRunConfiguration.getRadios(), jsonGenerator);
            }

            java.util.List<String> auxiliaryAppsList = scheduleRunConfiguration.getAuxiliaryApps();
            if (auxiliaryAppsList != null) {
                jsonGenerator.writeFieldName("auxiliaryApps");
                jsonGenerator.writeStartArray();
                for (String auxiliaryAppsListValue : auxiliaryAppsList) {
                    if (auxiliaryAppsListValue != null) {
                        jsonGenerator.writeValue(auxiliaryAppsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (scheduleRunConfiguration.getBillingMethod() != null) {
                jsonGenerator.writeFieldName("billingMethod").writeValue(scheduleRunConfiguration.getBillingMethod());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScheduleRunConfigurationJsonMarshaller instance;

    public static ScheduleRunConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleRunConfigurationJsonMarshaller();
        return instance;
    }

}
