/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ScheduleRunConfigurationMarshaller
 */
public class ScheduleRunConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ScheduleRunConfiguration scheduleRunConfiguration,
            JSONWriter jsonWriter) {
        if (scheduleRunConfiguration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (scheduleRunConfiguration.getExtraDataPackageArn() != null) {
                jsonWriter.key("extraDataPackageArn").value(
                        scheduleRunConfiguration.getExtraDataPackageArn());
            }

            if (scheduleRunConfiguration.getNetworkProfileArn() != null) {
                jsonWriter.key("networkProfileArn").value(
                        scheduleRunConfiguration.getNetworkProfileArn());
            }

            if (scheduleRunConfiguration.getLocale() != null) {
                jsonWriter.key("locale").value(
                        scheduleRunConfiguration.getLocale());
            }

            if (scheduleRunConfiguration.getLocation() != null) {
                jsonWriter.key("location");
                LocationJsonMarshaller.getInstance().marshall(
                        scheduleRunConfiguration.getLocation(), jsonWriter);
            }

            if (scheduleRunConfiguration.getRadios() != null) {
                jsonWriter.key("radios");
                RadiosJsonMarshaller.getInstance().marshall(
                        scheduleRunConfiguration.getRadios(), jsonWriter);
            }

            java.util.List<String> auxiliaryAppsList = scheduleRunConfiguration
                    .getAuxiliaryApps();
            if (auxiliaryAppsList != null) {
                jsonWriter.key("auxiliaryApps");
                jsonWriter.array();
                for (String auxiliaryAppsListValue : auxiliaryAppsList) {
                    if (auxiliaryAppsListValue != null) {
                        jsonWriter.value(auxiliaryAppsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (scheduleRunConfiguration.getBillingMethod() != null) {
                jsonWriter.key("billingMethod").value(
                        scheduleRunConfiguration.getBillingMethod());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScheduleRunConfigurationJsonMarshaller instance;

    public static ScheduleRunConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleRunConfigurationJsonMarshaller();
        return instance;
    }

}
