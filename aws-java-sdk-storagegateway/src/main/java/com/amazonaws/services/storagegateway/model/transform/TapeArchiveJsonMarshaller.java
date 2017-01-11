/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.protocol.json.*;

/**
 * TapeArchiveMarshaller
 */
public class TapeArchiveJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TapeArchive tapeArchive, StructuredJsonGenerator jsonGenerator) {

        if (tapeArchive == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (tapeArchive.getTapeARN() != null) {
                jsonGenerator.writeFieldName("TapeARN").writeValue(tapeArchive.getTapeARN());
            }
            if (tapeArchive.getTapeBarcode() != null) {
                jsonGenerator.writeFieldName("TapeBarcode").writeValue(tapeArchive.getTapeBarcode());
            }
            if (tapeArchive.getTapeCreatedDate() != null) {
                jsonGenerator.writeFieldName("TapeCreatedDate").writeValue(tapeArchive.getTapeCreatedDate());
            }
            if (tapeArchive.getTapeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("TapeSizeInBytes").writeValue(tapeArchive.getTapeSizeInBytes());
            }
            if (tapeArchive.getCompletionTime() != null) {
                jsonGenerator.writeFieldName("CompletionTime").writeValue(tapeArchive.getCompletionTime());
            }
            if (tapeArchive.getRetrievedTo() != null) {
                jsonGenerator.writeFieldName("RetrievedTo").writeValue(tapeArchive.getRetrievedTo());
            }
            if (tapeArchive.getTapeStatus() != null) {
                jsonGenerator.writeFieldName("TapeStatus").writeValue(tapeArchive.getTapeStatus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TapeArchiveJsonMarshaller instance;

    public static TapeArchiveJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeArchiveJsonMarshaller();
        return instance;
    }

}
