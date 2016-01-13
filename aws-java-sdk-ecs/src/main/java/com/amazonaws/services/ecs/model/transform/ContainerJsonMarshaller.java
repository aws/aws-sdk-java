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
 * ContainerMarshaller
 */
public class ContainerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Container container, JSONWriter jsonWriter) {
        if (container == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (container.getContainerArn() != null) {
                jsonWriter.key("containerArn").value(
                        container.getContainerArn());
            }

            if (container.getTaskArn() != null) {
                jsonWriter.key("taskArn").value(container.getTaskArn());
            }

            if (container.getName() != null) {
                jsonWriter.key("name").value(container.getName());
            }

            if (container.getLastStatus() != null) {
                jsonWriter.key("lastStatus").value(container.getLastStatus());
            }

            if (container.getExitCode() != null) {
                jsonWriter.key("exitCode").value(container.getExitCode());
            }

            if (container.getReason() != null) {
                jsonWriter.key("reason").value(container.getReason());
            }

            com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindingsList = (com.amazonaws.internal.SdkInternalList<NetworkBinding>) container
                    .getNetworkBindings();
            if (!networkBindingsList.isEmpty()
                    || !networkBindingsList.isAutoConstruct()) {
                jsonWriter.key("networkBindings");
                jsonWriter.array();
                for (NetworkBinding networkBindingsListValue : networkBindingsList) {
                    if (networkBindingsListValue != null) {

                        NetworkBindingJsonMarshaller.getInstance().marshall(
                                networkBindingsListValue, jsonWriter);
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

    private static ContainerJsonMarshaller instance;

    public static ContainerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerJsonMarshaller();
        return instance;
    }

}
