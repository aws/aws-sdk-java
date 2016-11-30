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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DomainEntryMarshaller
 */
public class DomainEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DomainEntry domainEntry, StructuredJsonGenerator jsonGenerator) {

        if (domainEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (domainEntry.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(domainEntry.getId());
            }
            if (domainEntry.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(domainEntry.getName());
            }
            if (domainEntry.getTarget() != null) {
                jsonGenerator.writeFieldName("target").writeValue(domainEntry.getTarget());
            }
            if (domainEntry.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(domainEntry.getType());
            }

            java.util.Map<String, String> optionsMap = domainEntry.getOptions();
            if (optionsMap != null) {
                jsonGenerator.writeFieldName("options");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> optionsMapValue : optionsMap.entrySet()) {
                    if (optionsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(optionsMapValue.getKey());

                        jsonGenerator.writeValue(optionsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DomainEntryJsonMarshaller instance;

    public static DomainEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainEntryJsonMarshaller();
        return instance;
    }

}
