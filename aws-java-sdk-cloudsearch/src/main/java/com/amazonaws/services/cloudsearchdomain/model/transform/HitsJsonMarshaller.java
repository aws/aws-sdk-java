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
 * HitsMarshaller
 */
public class HitsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Hits hits, StructuredJsonGenerator jsonGenerator) {

        if (hits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (hits.getFound() != null) {
                jsonGenerator.writeFieldName("found").writeValue(hits.getFound());
            }
            if (hits.getStart() != null) {
                jsonGenerator.writeFieldName("start").writeValue(hits.getStart());
            }
            if (hits.getCursor() != null) {
                jsonGenerator.writeFieldName("cursor").writeValue(hits.getCursor());
            }

            com.amazonaws.internal.SdkInternalList<Hit> hitList = (com.amazonaws.internal.SdkInternalList<Hit>) hits.getHit();
            if (!hitList.isEmpty() || !hitList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("hit");
                jsonGenerator.writeStartArray();
                for (Hit hitListValue : hitList) {
                    if (hitListValue != null) {

                        HitJsonMarshaller.getInstance().marshall(hitListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HitsJsonMarshaller instance;

    public static HitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HitsJsonMarshaller();
        return instance;
    }

}
