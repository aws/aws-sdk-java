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
 * CommandPluginMarshaller
 */
public class CommandPluginJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(CommandPlugin commandPlugin, JSONWriter jsonWriter) {
        if (commandPlugin == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (commandPlugin.getName() != null) {
                jsonWriter.key("Name").value(commandPlugin.getName());
            }

            if (commandPlugin.getStatus() != null) {
                jsonWriter.key("Status").value(commandPlugin.getStatus());
            }

            if (commandPlugin.getResponseCode() != null) {
                jsonWriter.key("ResponseCode").value(
                        commandPlugin.getResponseCode());
            }

            if (commandPlugin.getResponseStartDateTime() != null) {
                jsonWriter.key("ResponseStartDateTime").value(
                        commandPlugin.getResponseStartDateTime());
            }

            if (commandPlugin.getResponseFinishDateTime() != null) {
                jsonWriter.key("ResponseFinishDateTime").value(
                        commandPlugin.getResponseFinishDateTime());
            }

            if (commandPlugin.getOutput() != null) {
                jsonWriter.key("Output").value(commandPlugin.getOutput());
            }

            if (commandPlugin.getOutputS3BucketName() != null) {
                jsonWriter.key("OutputS3BucketName").value(
                        commandPlugin.getOutputS3BucketName());
            }

            if (commandPlugin.getOutputS3KeyPrefix() != null) {
                jsonWriter.key("OutputS3KeyPrefix").value(
                        commandPlugin.getOutputS3KeyPrefix());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandPluginJsonMarshaller instance;

    public static CommandPluginJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandPluginJsonMarshaller();
        return instance;
    }

}
