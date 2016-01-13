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

package com.amazonaws.services.cloudsearchdomain.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * HitMarshaller
 */
public class HitJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Hit hit, JSONWriter jsonWriter) {
        if (hit == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (hit.getId() != null) {
                jsonWriter.key("id").value(hit.getId());
            }

            com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>> fieldsMap = (com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>) hit
                    .getFields();
            if (!fieldsMap.isEmpty() || !fieldsMap.isAutoConstruct()) {
                jsonWriter.key("fields");
                jsonWriter.object();

                for (Map.Entry<String, java.util.List<String>> fieldsMapValue : fieldsMap
                        .entrySet()) {
                    if (fieldsMapValue.getValue() != null) {
                        jsonWriter.key(fieldsMapValue.getKey());

                        jsonWriter.array();
                        for (String fieldsMapValueList : fieldsMapValue
                                .getValue()) {
                            if (fieldsMapValueList != null) {
                                jsonWriter.value(fieldsMapValueList);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> exprsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hit
                    .getExprs();
            if (!exprsMap.isEmpty() || !exprsMap.isAutoConstruct()) {
                jsonWriter.key("exprs");
                jsonWriter.object();

                for (Map.Entry<String, String> exprsMapValue : exprsMap
                        .entrySet()) {
                    if (exprsMapValue.getValue() != null) {
                        jsonWriter.key(exprsMapValue.getKey());

                        jsonWriter.value(exprsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> highlightsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hit
                    .getHighlights();
            if (!highlightsMap.isEmpty() || !highlightsMap.isAutoConstruct()) {
                jsonWriter.key("highlights");
                jsonWriter.object();

                for (Map.Entry<String, String> highlightsMapValue : highlightsMap
                        .entrySet()) {
                    if (highlightsMapValue.getValue() != null) {
                        jsonWriter.key(highlightsMapValue.getKey());

                        jsonWriter.value(highlightsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HitJsonMarshaller instance;

    public static HitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HitJsonMarshaller();
        return instance;
    }

}
