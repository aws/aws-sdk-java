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
 * CommandMarshaller
 */
public class CommandJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Command command, JSONWriter jsonWriter) {
        if (command == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (command.getCommandId() != null) {
                jsonWriter.key("CommandId").value(command.getCommandId());
            }

            if (command.getDocumentName() != null) {
                jsonWriter.key("DocumentName").value(command.getDocumentName());
            }

            if (command.getComment() != null) {
                jsonWriter.key("Comment").value(command.getComment());
            }

            if (command.getExpiresAfter() != null) {
                jsonWriter.key("ExpiresAfter").value(command.getExpiresAfter());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = command
                    .getParameters();
            if (parametersMap != null) {
                jsonWriter.key("Parameters");
                jsonWriter.object();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap
                        .entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonWriter.key(parametersMapValue.getKey());

                        jsonWriter.array();
                        for (String parametersMapValueList : parametersMapValue
                                .getValue()) {
                            if (parametersMapValueList != null) {
                                jsonWriter.value(parametersMapValueList);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) command
                    .getInstanceIds();
            if (!instanceIdsList.isEmpty()
                    || !instanceIdsList.isAutoConstruct()) {
                jsonWriter.key("InstanceIds");
                jsonWriter.array();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonWriter.value(instanceIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (command.getRequestedDateTime() != null) {
                jsonWriter.key("RequestedDateTime").value(
                        command.getRequestedDateTime());
            }

            if (command.getStatus() != null) {
                jsonWriter.key("Status").value(command.getStatus());
            }

            if (command.getOutputS3BucketName() != null) {
                jsonWriter.key("OutputS3BucketName").value(
                        command.getOutputS3BucketName());
            }

            if (command.getOutputS3KeyPrefix() != null) {
                jsonWriter.key("OutputS3KeyPrefix").value(
                        command.getOutputS3KeyPrefix());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandJsonMarshaller instance;

    public static CommandJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonMarshaller();
        return instance;
    }

}
