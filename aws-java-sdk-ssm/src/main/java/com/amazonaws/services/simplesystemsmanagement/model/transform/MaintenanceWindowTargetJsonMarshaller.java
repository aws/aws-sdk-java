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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MaintenanceWindowTargetMarshaller
 */
public class MaintenanceWindowTargetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MaintenanceWindowTarget maintenanceWindowTarget, StructuredJsonGenerator jsonGenerator) {

        if (maintenanceWindowTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (maintenanceWindowTarget.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(maintenanceWindowTarget.getWindowId());
            }
            if (maintenanceWindowTarget.getWindowTargetId() != null) {
                jsonGenerator.writeFieldName("WindowTargetId").writeValue(maintenanceWindowTarget.getWindowTargetId());
            }
            if (maintenanceWindowTarget.getResourceType() != null) {
                jsonGenerator.writeFieldName("ResourceType").writeValue(maintenanceWindowTarget.getResourceType());
            }

            com.amazonaws.internal.SdkInternalList<Target> targetsList = (com.amazonaws.internal.SdkInternalList<Target>) maintenanceWindowTarget.getTargets();
            if (!targetsList.isEmpty() || !targetsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Targets");
                jsonGenerator.writeStartArray();
                for (Target targetsListValue : targetsList) {
                    if (targetsListValue != null) {

                        TargetJsonMarshaller.getInstance().marshall(targetsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (maintenanceWindowTarget.getOwnerInformation() != null) {
                jsonGenerator.writeFieldName("OwnerInformation").writeValue(maintenanceWindowTarget.getOwnerInformation());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MaintenanceWindowTargetJsonMarshaller instance;

    public static MaintenanceWindowTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowTargetJsonMarshaller();
        return instance;
    }

}
