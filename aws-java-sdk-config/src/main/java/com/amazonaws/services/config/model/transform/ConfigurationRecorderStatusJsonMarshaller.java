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

package com.amazonaws.services.config.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ConfigurationRecorderStatusMarshaller
 */
public class ConfigurationRecorderStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            ConfigurationRecorderStatus configurationRecorderStatus,
            JSONWriter jsonWriter) {
        if (configurationRecorderStatus == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (configurationRecorderStatus.getName() != null) {
                jsonWriter.key("name").value(
                        configurationRecorderStatus.getName());
            }

            if (configurationRecorderStatus.getLastStartTime() != null) {
                jsonWriter.key("lastStartTime").value(
                        configurationRecorderStatus.getLastStartTime());
            }

            if (configurationRecorderStatus.getLastStopTime() != null) {
                jsonWriter.key("lastStopTime").value(
                        configurationRecorderStatus.getLastStopTime());
            }

            if (configurationRecorderStatus.getRecording() != null) {
                jsonWriter.key("recording").value(
                        configurationRecorderStatus.getRecording());
            }

            if (configurationRecorderStatus.getLastStatus() != null) {
                jsonWriter.key("lastStatus").value(
                        configurationRecorderStatus.getLastStatus());
            }

            if (configurationRecorderStatus.getLastErrorCode() != null) {
                jsonWriter.key("lastErrorCode").value(
                        configurationRecorderStatus.getLastErrorCode());
            }

            if (configurationRecorderStatus.getLastErrorMessage() != null) {
                jsonWriter.key("lastErrorMessage").value(
                        configurationRecorderStatus.getLastErrorMessage());
            }

            if (configurationRecorderStatus.getLastStatusChangeTime() != null) {
                jsonWriter.key("lastStatusChangeTime").value(
                        configurationRecorderStatus.getLastStatusChangeTime());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigurationRecorderStatusJsonMarshaller instance;

    public static ConfigurationRecorderStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationRecorderStatusJsonMarshaller();
        return instance;
    }

}
