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
package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobParametersMarshaller
 */
public class JobParametersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobParameters jobParameters, StructuredJsonGenerator jsonGenerator) {

        if (jobParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobParameters.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(jobParameters.getFormat());
            }
            if (jobParameters.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(jobParameters.getType());
            }
            if (jobParameters.getArchiveId() != null) {
                jsonGenerator.writeFieldName("ArchiveId").writeValue(jobParameters.getArchiveId());
            }
            if (jobParameters.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(jobParameters.getDescription());
            }
            if (jobParameters.getSNSTopic() != null) {
                jsonGenerator.writeFieldName("SNSTopic").writeValue(jobParameters.getSNSTopic());
            }
            if (jobParameters.getRetrievalByteRange() != null) {
                jsonGenerator.writeFieldName("RetrievalByteRange").writeValue(jobParameters.getRetrievalByteRange());
            }
            if (jobParameters.getTier() != null) {
                jsonGenerator.writeFieldName("Tier").writeValue(jobParameters.getTier());
            }
            if (jobParameters.getInventoryRetrievalParameters() != null) {
                jsonGenerator.writeFieldName("InventoryRetrievalParameters");
                InventoryRetrievalJobInputJsonMarshaller.getInstance().marshall(jobParameters.getInventoryRetrievalParameters(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobParametersJsonMarshaller instance;

    public static JobParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobParametersJsonMarshaller();
        return instance;
    }

}
