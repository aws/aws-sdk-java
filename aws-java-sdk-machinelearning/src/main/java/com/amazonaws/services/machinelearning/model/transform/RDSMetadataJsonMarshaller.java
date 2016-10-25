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
package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RDSMetadataMarshaller
 */
public class RDSMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RDSMetadata rDSMetadata, StructuredJsonGenerator jsonGenerator) {

        if (rDSMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (rDSMetadata.getDatabase() != null) {
                jsonGenerator.writeFieldName("Database");
                RDSDatabaseJsonMarshaller.getInstance().marshall(rDSMetadata.getDatabase(), jsonGenerator);
            }
            if (rDSMetadata.getDatabaseUserName() != null) {
                jsonGenerator.writeFieldName("DatabaseUserName").writeValue(rDSMetadata.getDatabaseUserName());
            }
            if (rDSMetadata.getSelectSqlQuery() != null) {
                jsonGenerator.writeFieldName("SelectSqlQuery").writeValue(rDSMetadata.getSelectSqlQuery());
            }
            if (rDSMetadata.getResourceRole() != null) {
                jsonGenerator.writeFieldName("ResourceRole").writeValue(rDSMetadata.getResourceRole());
            }
            if (rDSMetadata.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(rDSMetadata.getServiceRole());
            }
            if (rDSMetadata.getDataPipelineId() != null) {
                jsonGenerator.writeFieldName("DataPipelineId").writeValue(rDSMetadata.getDataPipelineId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RDSMetadataJsonMarshaller instance;

    public static RDSMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RDSMetadataJsonMarshaller();
        return instance;
    }

}
