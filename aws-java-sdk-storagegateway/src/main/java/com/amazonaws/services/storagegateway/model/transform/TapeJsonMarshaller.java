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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TapeMarshaller
 */
public class TapeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Tape tape, StructuredJsonGenerator jsonGenerator) {

        if (tape == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (tape.getTapeARN() != null) {
                jsonGenerator.writeFieldName("TapeARN").writeValue(tape.getTapeARN());
            }
            if (tape.getTapeBarcode() != null) {
                jsonGenerator.writeFieldName("TapeBarcode").writeValue(tape.getTapeBarcode());
            }
            if (tape.getTapeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("TapeSizeInBytes").writeValue(tape.getTapeSizeInBytes());
            }
            if (tape.getTapeStatus() != null) {
                jsonGenerator.writeFieldName("TapeStatus").writeValue(tape.getTapeStatus());
            }
            if (tape.getVTLDevice() != null) {
                jsonGenerator.writeFieldName("VTLDevice").writeValue(tape.getVTLDevice());
            }
            if (tape.getProgress() != null) {
                jsonGenerator.writeFieldName("Progress").writeValue(tape.getProgress());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TapeJsonMarshaller instance;

    public static TapeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeJsonMarshaller();
        return instance;
    }

}
