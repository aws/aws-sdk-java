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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ReportedOsMarshaller
 */
public class ReportedOsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReportedOs reportedOs, StructuredJsonGenerator jsonGenerator) {

        if (reportedOs == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (reportedOs.getFamily() != null) {
                jsonGenerator.writeFieldName("Family").writeValue(reportedOs.getFamily());
            }
            if (reportedOs.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(reportedOs.getName());
            }
            if (reportedOs.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(reportedOs.getVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReportedOsJsonMarshaller instance;

    public static ReportedOsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReportedOsJsonMarshaller();
        return instance;
    }

}
