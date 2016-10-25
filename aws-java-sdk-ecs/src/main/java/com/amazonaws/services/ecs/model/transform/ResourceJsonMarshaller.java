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
 * ResourceMarshaller
 */
public class ResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Resource resource, StructuredJsonGenerator jsonGenerator) {

        if (resource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (resource.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(resource.getName());
            }
            if (resource.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(resource.getType());
            }
            if (resource.getDoubleValue() != null) {
                jsonGenerator.writeFieldName("doubleValue").writeValue(resource.getDoubleValue());
            }
            if (resource.getLongValue() != null) {
                jsonGenerator.writeFieldName("longValue").writeValue(resource.getLongValue());
            }
            if (resource.getIntegerValue() != null) {
                jsonGenerator.writeFieldName("integerValue").writeValue(resource.getIntegerValue());
            }

            com.amazonaws.internal.SdkInternalList<String> stringSetValueList = (com.amazonaws.internal.SdkInternalList<String>) resource.getStringSetValue();
            if (!stringSetValueList.isEmpty() || !stringSetValueList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("stringSetValue");
                jsonGenerator.writeStartArray();
                for (String stringSetValueListValue : stringSetValueList) {
                    if (stringSetValueListValue != null) {
                        jsonGenerator.writeValue(stringSetValueListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }

}
