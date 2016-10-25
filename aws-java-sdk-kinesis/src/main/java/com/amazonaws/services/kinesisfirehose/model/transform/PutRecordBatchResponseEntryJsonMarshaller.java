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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PutRecordBatchResponseEntryMarshaller
 */
public class PutRecordBatchResponseEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PutRecordBatchResponseEntry putRecordBatchResponseEntry, StructuredJsonGenerator jsonGenerator) {

        if (putRecordBatchResponseEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (putRecordBatchResponseEntry.getRecordId() != null) {
                jsonGenerator.writeFieldName("RecordId").writeValue(putRecordBatchResponseEntry.getRecordId());
            }
            if (putRecordBatchResponseEntry.getErrorCode() != null) {
                jsonGenerator.writeFieldName("ErrorCode").writeValue(putRecordBatchResponseEntry.getErrorCode());
            }
            if (putRecordBatchResponseEntry.getErrorMessage() != null) {
                jsonGenerator.writeFieldName("ErrorMessage").writeValue(putRecordBatchResponseEntry.getErrorMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PutRecordBatchResponseEntryJsonMarshaller instance;

    public static PutRecordBatchResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordBatchResponseEntryJsonMarshaller();
        return instance;
    }

}
