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
 * PatchFilterGroupMarshaller
 */
public class PatchFilterGroupJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PatchFilterGroup patchFilterGroup, StructuredJsonGenerator jsonGenerator) {

        if (patchFilterGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<PatchFilter> patchFiltersList = (com.amazonaws.internal.SdkInternalList<PatchFilter>) patchFilterGroup
                    .getPatchFilters();
            if (!patchFiltersList.isEmpty() || !patchFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("PatchFilters");
                jsonGenerator.writeStartArray();
                for (PatchFilter patchFiltersListValue : patchFiltersList) {
                    if (patchFiltersListValue != null) {

                        PatchFilterJsonMarshaller.getInstance().marshall(patchFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PatchFilterGroupJsonMarshaller instance;

    public static PatchFilterGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchFilterGroupJsonMarshaller();
        return instance;
    }

}
