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
 * DataSourceMarshaller
 */
public class DataSourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DataSource dataSource, StructuredJsonGenerator jsonGenerator) {

        if (dataSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (dataSource.getDataSourceId() != null) {
                jsonGenerator.writeFieldName("DataSourceId").writeValue(dataSource.getDataSourceId());
            }
            if (dataSource.getDataLocationS3() != null) {
                jsonGenerator.writeFieldName("DataLocationS3").writeValue(dataSource.getDataLocationS3());
            }
            if (dataSource.getDataRearrangement() != null) {
                jsonGenerator.writeFieldName("DataRearrangement").writeValue(dataSource.getDataRearrangement());
            }
            if (dataSource.getCreatedByIamUser() != null) {
                jsonGenerator.writeFieldName("CreatedByIamUser").writeValue(dataSource.getCreatedByIamUser());
            }
            if (dataSource.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(dataSource.getCreatedAt());
            }
            if (dataSource.getLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("LastUpdatedAt").writeValue(dataSource.getLastUpdatedAt());
            }
            if (dataSource.getDataSizeInBytes() != null) {
                jsonGenerator.writeFieldName("DataSizeInBytes").writeValue(dataSource.getDataSizeInBytes());
            }
            if (dataSource.getNumberOfFiles() != null) {
                jsonGenerator.writeFieldName("NumberOfFiles").writeValue(dataSource.getNumberOfFiles());
            }
            if (dataSource.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(dataSource.getName());
            }
            if (dataSource.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(dataSource.getStatus());
            }
            if (dataSource.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(dataSource.getMessage());
            }
            if (dataSource.getRedshiftMetadata() != null) {
                jsonGenerator.writeFieldName("RedshiftMetadata");
                RedshiftMetadataJsonMarshaller.getInstance().marshall(dataSource.getRedshiftMetadata(), jsonGenerator);
            }
            if (dataSource.getRDSMetadata() != null) {
                jsonGenerator.writeFieldName("RDSMetadata");
                RDSMetadataJsonMarshaller.getInstance().marshall(dataSource.getRDSMetadata(), jsonGenerator);
            }
            if (dataSource.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(dataSource.getRoleARN());
            }
            if (dataSource.getComputeStatistics() != null) {
                jsonGenerator.writeFieldName("ComputeStatistics").writeValue(dataSource.getComputeStatistics());
            }
            if (dataSource.getComputeTime() != null) {
                jsonGenerator.writeFieldName("ComputeTime").writeValue(dataSource.getComputeTime());
            }
            if (dataSource.getFinishedAt() != null) {
                jsonGenerator.writeFieldName("FinishedAt").writeValue(dataSource.getFinishedAt());
            }
            if (dataSource.getStartedAt() != null) {
                jsonGenerator.writeFieldName("StartedAt").writeValue(dataSource.getStartedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DataSourceJsonMarshaller instance;

    public static DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonMarshaller();
        return instance;
    }

}
