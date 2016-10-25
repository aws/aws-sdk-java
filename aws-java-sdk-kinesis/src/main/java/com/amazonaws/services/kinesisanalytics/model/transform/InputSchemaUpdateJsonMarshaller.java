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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InputSchemaUpdateMarshaller
 */
public class InputSchemaUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InputSchemaUpdate inputSchemaUpdate, StructuredJsonGenerator jsonGenerator) {

        if (inputSchemaUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inputSchemaUpdate.getRecordFormatUpdate() != null) {
                jsonGenerator.writeFieldName("RecordFormatUpdate");
                RecordFormatJsonMarshaller.getInstance().marshall(inputSchemaUpdate.getRecordFormatUpdate(), jsonGenerator);
            }
            if (inputSchemaUpdate.getRecordEncodingUpdate() != null) {
                jsonGenerator.writeFieldName("RecordEncodingUpdate").writeValue(inputSchemaUpdate.getRecordEncodingUpdate());
            }

            java.util.List<RecordColumn> recordColumnUpdatesList = inputSchemaUpdate.getRecordColumnUpdates();
            if (recordColumnUpdatesList != null) {
                jsonGenerator.writeFieldName("RecordColumnUpdates");
                jsonGenerator.writeStartArray();
                for (RecordColumn recordColumnUpdatesListValue : recordColumnUpdatesList) {
                    if (recordColumnUpdatesListValue != null) {

                        RecordColumnJsonMarshaller.getInstance().marshall(recordColumnUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InputSchemaUpdateJsonMarshaller instance;

    public static InputSchemaUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputSchemaUpdateJsonMarshaller();
        return instance;
    }

}
