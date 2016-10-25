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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DataTransferMarshaller
 */
public class DataTransferJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DataTransfer dataTransfer, StructuredJsonGenerator jsonGenerator) {

        if (dataTransfer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (dataTransfer.getBytesTransferred() != null) {
                jsonGenerator.writeFieldName("BytesTransferred").writeValue(dataTransfer.getBytesTransferred());
            }
            if (dataTransfer.getObjectsTransferred() != null) {
                jsonGenerator.writeFieldName("ObjectsTransferred").writeValue(dataTransfer.getObjectsTransferred());
            }
            if (dataTransfer.getTotalBytes() != null) {
                jsonGenerator.writeFieldName("TotalBytes").writeValue(dataTransfer.getTotalBytes());
            }
            if (dataTransfer.getTotalObjects() != null) {
                jsonGenerator.writeFieldName("TotalObjects").writeValue(dataTransfer.getTotalObjects());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DataTransferJsonMarshaller instance;

    public static DataTransferJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataTransferJsonMarshaller();
        return instance;
    }

}
