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
package com.amazonaws.services.datapipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * QueryMarshaller
 */
public class QueryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Query query, StructuredJsonGenerator jsonGenerator) {

        if (query == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<Selector> selectorsList = (com.amazonaws.internal.SdkInternalList<Selector>) query.getSelectors();
            if (!selectorsList.isEmpty() || !selectorsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("selectors");
                jsonGenerator.writeStartArray();
                for (Selector selectorsListValue : selectorsList) {
                    if (selectorsListValue != null) {

                        SelectorJsonMarshaller.getInstance().marshall(selectorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static QueryJsonMarshaller instance;

    public static QueryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryJsonMarshaller();
        return instance;
    }

}
