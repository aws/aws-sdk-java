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

package com.amazonaws.services.ecs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ContainerOverrideMarshaller
 */
public class ContainerOverrideJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ContainerOverride containerOverride,
            JSONWriter jsonWriter) {
        if (containerOverride == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (containerOverride.getName() != null) {
                jsonWriter.key("name").value(containerOverride.getName());
            }

            com.amazonaws.internal.SdkInternalList<String> commandList = (com.amazonaws.internal.SdkInternalList<String>) containerOverride
                    .getCommand();
            if (!commandList.isEmpty() || !commandList.isAutoConstruct()) {
                jsonWriter.key("command");
                jsonWriter.array();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonWriter.value(commandListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<KeyValuePair> environmentList = (com.amazonaws.internal.SdkInternalList<KeyValuePair>) containerOverride
                    .getEnvironment();
            if (!environmentList.isEmpty()
                    || !environmentList.isAutoConstruct()) {
                jsonWriter.key("environment");
                jsonWriter.array();
                for (KeyValuePair environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        KeyValuePairJsonMarshaller.getInstance().marshall(
                                environmentListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerOverrideJsonMarshaller instance;

    public static ContainerOverrideJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverrideJsonMarshaller();
        return instance;
    }

}
