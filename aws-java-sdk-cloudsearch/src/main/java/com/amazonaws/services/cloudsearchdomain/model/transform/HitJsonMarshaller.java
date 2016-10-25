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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * HitMarshaller
 */
public class HitJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Hit hit, StructuredJsonGenerator jsonGenerator) {

        if (hit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (hit.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(hit.getId());
            }

            com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>> fieldsMap = (com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>) hit
                    .getFields();
            if (!fieldsMap.isEmpty() || !fieldsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("fields");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<String>> fieldsMapValue : fieldsMap.entrySet()) {
                    if (fieldsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(fieldsMapValue.getKey());

                        jsonGenerator.writeStartArray();
                        for (String fieldsMapValueList : fieldsMapValue.getValue()) {
                            if (fieldsMapValueList != null) {
                                jsonGenerator.writeValue(fieldsMapValueList);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> exprsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hit.getExprs();
            if (!exprsMap.isEmpty() || !exprsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("exprs");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> exprsMapValue : exprsMap.entrySet()) {
                    if (exprsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(exprsMapValue.getKey());

                        jsonGenerator.writeValue(exprsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> highlightsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hit.getHighlights();
            if (!highlightsMap.isEmpty() || !highlightsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("highlights");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> highlightsMapValue : highlightsMap.entrySet()) {
                    if (highlightsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(highlightsMapValue.getKey());

                        jsonGenerator.writeValue(highlightsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HitJsonMarshaller instance;

    public static HitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HitJsonMarshaller();
        return instance;
    }

}
