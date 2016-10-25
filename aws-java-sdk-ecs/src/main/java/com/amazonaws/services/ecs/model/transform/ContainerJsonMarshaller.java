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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ContainerMarshaller
 */
public class ContainerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Container container, StructuredJsonGenerator jsonGenerator) {

        if (container == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (container.getContainerArn() != null) {
                jsonGenerator.writeFieldName("containerArn").writeValue(container.getContainerArn());
            }
            if (container.getTaskArn() != null) {
                jsonGenerator.writeFieldName("taskArn").writeValue(container.getTaskArn());
            }
            if (container.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(container.getName());
            }
            if (container.getLastStatus() != null) {
                jsonGenerator.writeFieldName("lastStatus").writeValue(container.getLastStatus());
            }
            if (container.getExitCode() != null) {
                jsonGenerator.writeFieldName("exitCode").writeValue(container.getExitCode());
            }
            if (container.getReason() != null) {
                jsonGenerator.writeFieldName("reason").writeValue(container.getReason());
            }

            com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindingsList = (com.amazonaws.internal.SdkInternalList<NetworkBinding>) container
                    .getNetworkBindings();
            if (!networkBindingsList.isEmpty() || !networkBindingsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("networkBindings");
                jsonGenerator.writeStartArray();
                for (NetworkBinding networkBindingsListValue : networkBindingsList) {
                    if (networkBindingsListValue != null) {

                        NetworkBindingJsonMarshaller.getInstance().marshall(networkBindingsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerJsonMarshaller instance;

    public static ContainerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerJsonMarshaller();
        return instance;
    }

}
