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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BackendConnectionErrorsMarshaller
 */
public class BackendConnectionErrorsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BackendConnectionErrors backendConnectionErrors, StructuredJsonGenerator jsonGenerator) {

        if (backendConnectionErrors == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (backendConnectionErrors.getTimeoutCount() != null) {
                jsonGenerator.writeFieldName("TimeoutCount").writeValue(backendConnectionErrors.getTimeoutCount());
            }
            if (backendConnectionErrors.getConnectionRefusedCount() != null) {
                jsonGenerator.writeFieldName("ConnectionRefusedCount").writeValue(backendConnectionErrors.getConnectionRefusedCount());
            }
            if (backendConnectionErrors.getHTTPCode4XXCount() != null) {
                jsonGenerator.writeFieldName("HTTPCode4XXCount").writeValue(backendConnectionErrors.getHTTPCode4XXCount());
            }
            if (backendConnectionErrors.getHTTPCode5XXCount() != null) {
                jsonGenerator.writeFieldName("HTTPCode5XXCount").writeValue(backendConnectionErrors.getHTTPCode5XXCount());
            }
            if (backendConnectionErrors.getUnknownHostCount() != null) {
                jsonGenerator.writeFieldName("UnknownHostCount").writeValue(backendConnectionErrors.getUnknownHostCount());
            }
            if (backendConnectionErrors.getOtherCount() != null) {
                jsonGenerator.writeFieldName("OtherCount").writeValue(backendConnectionErrors.getOtherCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BackendConnectionErrorsJsonMarshaller instance;

    public static BackendConnectionErrorsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackendConnectionErrorsJsonMarshaller();
        return instance;
    }

}
