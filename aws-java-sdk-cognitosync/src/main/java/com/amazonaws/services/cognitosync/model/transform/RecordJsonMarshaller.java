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
package com.amazonaws.services.cognitosync.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RecordMarshaller
 */
public class RecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Record record, StructuredJsonGenerator jsonGenerator) {

        if (record == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (record.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(record.getKey());
            }
            if (record.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(record.getValue());
            }
            if (record.getSyncCount() != null) {
                jsonGenerator.writeFieldName("SyncCount").writeValue(record.getSyncCount());
            }
            if (record.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(record.getLastModifiedDate());
            }
            if (record.getLastModifiedBy() != null) {
                jsonGenerator.writeFieldName("LastModifiedBy").writeValue(record.getLastModifiedBy());
            }
            if (record.getDeviceLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("DeviceLastModifiedDate").writeValue(record.getDeviceLastModifiedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecordJsonMarshaller instance;

    public static RecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordJsonMarshaller();
        return instance;
    }

}
