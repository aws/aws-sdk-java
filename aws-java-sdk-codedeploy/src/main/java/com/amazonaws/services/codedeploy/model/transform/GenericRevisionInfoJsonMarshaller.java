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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GenericRevisionInfoMarshaller
 */
public class GenericRevisionInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GenericRevisionInfo genericRevisionInfo, StructuredJsonGenerator jsonGenerator) {

        if (genericRevisionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (genericRevisionInfo.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(genericRevisionInfo.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<String> deploymentGroupsList = (com.amazonaws.internal.SdkInternalList<String>) genericRevisionInfo
                    .getDeploymentGroups();
            if (!deploymentGroupsList.isEmpty() || !deploymentGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("deploymentGroups");
                jsonGenerator.writeStartArray();
                for (String deploymentGroupsListValue : deploymentGroupsList) {
                    if (deploymentGroupsListValue != null) {
                        jsonGenerator.writeValue(deploymentGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (genericRevisionInfo.getFirstUsedTime() != null) {
                jsonGenerator.writeFieldName("firstUsedTime").writeValue(genericRevisionInfo.getFirstUsedTime());
            }
            if (genericRevisionInfo.getLastUsedTime() != null) {
                jsonGenerator.writeFieldName("lastUsedTime").writeValue(genericRevisionInfo.getLastUsedTime());
            }
            if (genericRevisionInfo.getRegisterTime() != null) {
                jsonGenerator.writeFieldName("registerTime").writeValue(genericRevisionInfo.getRegisterTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GenericRevisionInfoJsonMarshaller instance;

    public static GenericRevisionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GenericRevisionInfoJsonMarshaller();
        return instance;
    }

}
