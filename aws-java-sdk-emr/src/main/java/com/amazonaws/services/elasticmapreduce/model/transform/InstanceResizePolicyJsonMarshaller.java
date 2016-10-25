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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceResizePolicyMarshaller
 */
public class InstanceResizePolicyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceResizePolicy instanceResizePolicy, StructuredJsonGenerator jsonGenerator) {

        if (instanceResizePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> instancesToTerminateList = (com.amazonaws.internal.SdkInternalList<String>) instanceResizePolicy
                    .getInstancesToTerminate();
            if (!instancesToTerminateList.isEmpty() || !instancesToTerminateList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstancesToTerminate");
                jsonGenerator.writeStartArray();
                for (String instancesToTerminateListValue : instancesToTerminateList) {
                    if (instancesToTerminateListValue != null) {
                        jsonGenerator.writeValue(instancesToTerminateListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> instancesToProtectList = (com.amazonaws.internal.SdkInternalList<String>) instanceResizePolicy
                    .getInstancesToProtect();
            if (!instancesToProtectList.isEmpty() || !instancesToProtectList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstancesToProtect");
                jsonGenerator.writeStartArray();
                for (String instancesToProtectListValue : instancesToProtectList) {
                    if (instancesToProtectListValue != null) {
                        jsonGenerator.writeValue(instancesToProtectListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (instanceResizePolicy.getInstanceTerminationTimeout() != null) {
                jsonGenerator.writeFieldName("InstanceTerminationTimeout").writeValue(instanceResizePolicy.getInstanceTerminationTimeout());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceResizePolicyJsonMarshaller instance;

    public static InstanceResizePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceResizePolicyJsonMarshaller();
        return instance;
    }

}
