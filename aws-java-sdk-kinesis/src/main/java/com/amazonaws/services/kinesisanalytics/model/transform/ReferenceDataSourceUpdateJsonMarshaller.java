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
 * ReferenceDataSourceUpdateMarshaller
 */
public class ReferenceDataSourceUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReferenceDataSourceUpdate referenceDataSourceUpdate, StructuredJsonGenerator jsonGenerator) {

        if (referenceDataSourceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (referenceDataSourceUpdate.getReferenceId() != null) {
                jsonGenerator.writeFieldName("ReferenceId").writeValue(referenceDataSourceUpdate.getReferenceId());
            }
            if (referenceDataSourceUpdate.getTableNameUpdate() != null) {
                jsonGenerator.writeFieldName("TableNameUpdate").writeValue(referenceDataSourceUpdate.getTableNameUpdate());
            }
            if (referenceDataSourceUpdate.getS3ReferenceDataSourceUpdate() != null) {
                jsonGenerator.writeFieldName("S3ReferenceDataSourceUpdate");
                S3ReferenceDataSourceUpdateJsonMarshaller.getInstance().marshall(referenceDataSourceUpdate.getS3ReferenceDataSourceUpdate(), jsonGenerator);
            }
            if (referenceDataSourceUpdate.getReferenceSchemaUpdate() != null) {
                jsonGenerator.writeFieldName("ReferenceSchemaUpdate");
                SourceSchemaJsonMarshaller.getInstance().marshall(referenceDataSourceUpdate.getReferenceSchemaUpdate(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReferenceDataSourceUpdateJsonMarshaller instance;

    public static ReferenceDataSourceUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReferenceDataSourceUpdateJsonMarshaller();
        return instance;
    }

}
