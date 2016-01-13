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

package com.amazonaws.services.simplesystemsmanagement.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * InstanceInformationMarshaller
 */
public class InstanceInformationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(InstanceInformation instanceInformation,
            JSONWriter jsonWriter) {
        if (instanceInformation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instanceInformation.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(
                        instanceInformation.getInstanceId());
            }

            if (instanceInformation.getPingStatus() != null) {
                jsonWriter.key("PingStatus").value(
                        instanceInformation.getPingStatus());
            }

            if (instanceInformation.getLastPingDateTime() != null) {
                jsonWriter.key("LastPingDateTime").value(
                        instanceInformation.getLastPingDateTime());
            }

            if (instanceInformation.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        instanceInformation.getAgentVersion());
            }

            if (instanceInformation.getIsLatestVersion() != null) {
                jsonWriter.key("IsLatestVersion").value(
                        instanceInformation.getIsLatestVersion());
            }

            if (instanceInformation.getPlatformType() != null) {
                jsonWriter.key("PlatformType").value(
                        instanceInformation.getPlatformType());
            }

            if (instanceInformation.getPlatformName() != null) {
                jsonWriter.key("PlatformName").value(
                        instanceInformation.getPlatformName());
            }

            if (instanceInformation.getPlatformVersion() != null) {
                jsonWriter.key("PlatformVersion").value(
                        instanceInformation.getPlatformVersion());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceInformationJsonMarshaller instance;

    public static InstanceInformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationJsonMarshaller();
        return instance;
    }

}
