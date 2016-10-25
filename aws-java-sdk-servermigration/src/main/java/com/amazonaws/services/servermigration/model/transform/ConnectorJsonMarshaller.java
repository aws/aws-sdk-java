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
package com.amazonaws.services.servermigration.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConnectorMarshaller
 */
public class ConnectorJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Connector connector, StructuredJsonGenerator jsonGenerator) {

        if (connector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (connector.getConnectorId() != null) {
                jsonGenerator.writeFieldName("connectorId").writeValue(connector.getConnectorId());
            }
            if (connector.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(connector.getVersion());
            }
            if (connector.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(connector.getStatus());
            }

            java.util.List<String> capabilityListList = connector.getCapabilityList();
            if (capabilityListList != null) {
                jsonGenerator.writeFieldName("capabilityList");
                jsonGenerator.writeStartArray();
                for (String capabilityListListValue : capabilityListList) {
                    if (capabilityListListValue != null) {
                        jsonGenerator.writeValue(capabilityListListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (connector.getVmManagerName() != null) {
                jsonGenerator.writeFieldName("vmManagerName").writeValue(connector.getVmManagerName());
            }
            if (connector.getVmManagerType() != null) {
                jsonGenerator.writeFieldName("vmManagerType").writeValue(connector.getVmManagerType());
            }
            if (connector.getVmManagerId() != null) {
                jsonGenerator.writeFieldName("vmManagerId").writeValue(connector.getVmManagerId());
            }
            if (connector.getIpAddress() != null) {
                jsonGenerator.writeFieldName("ipAddress").writeValue(connector.getIpAddress());
            }
            if (connector.getMacAddress() != null) {
                jsonGenerator.writeFieldName("macAddress").writeValue(connector.getMacAddress());
            }
            if (connector.getAssociatedOn() != null) {
                jsonGenerator.writeFieldName("associatedOn").writeValue(connector.getAssociatedOn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConnectorJsonMarshaller instance;

    public static ConnectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorJsonMarshaller();
        return instance;
    }

}
