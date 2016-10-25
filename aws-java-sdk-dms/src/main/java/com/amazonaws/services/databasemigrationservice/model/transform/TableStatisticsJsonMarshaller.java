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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TableStatisticsMarshaller
 */
public class TableStatisticsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TableStatistics tableStatistics, StructuredJsonGenerator jsonGenerator) {

        if (tableStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (tableStatistics.getSchemaName() != null) {
                jsonGenerator.writeFieldName("SchemaName").writeValue(tableStatistics.getSchemaName());
            }
            if (tableStatistics.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(tableStatistics.getTableName());
            }
            if (tableStatistics.getInserts() != null) {
                jsonGenerator.writeFieldName("Inserts").writeValue(tableStatistics.getInserts());
            }
            if (tableStatistics.getDeletes() != null) {
                jsonGenerator.writeFieldName("Deletes").writeValue(tableStatistics.getDeletes());
            }
            if (tableStatistics.getUpdates() != null) {
                jsonGenerator.writeFieldName("Updates").writeValue(tableStatistics.getUpdates());
            }
            if (tableStatistics.getDdls() != null) {
                jsonGenerator.writeFieldName("Ddls").writeValue(tableStatistics.getDdls());
            }
            if (tableStatistics.getFullLoadRows() != null) {
                jsonGenerator.writeFieldName("FullLoadRows").writeValue(tableStatistics.getFullLoadRows());
            }
            if (tableStatistics.getLastUpdateTime() != null) {
                jsonGenerator.writeFieldName("LastUpdateTime").writeValue(tableStatistics.getLastUpdateTime());
            }
            if (tableStatistics.getTableState() != null) {
                jsonGenerator.writeFieldName("TableState").writeValue(tableStatistics.getTableState());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TableStatisticsJsonMarshaller instance;

    public static TableStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableStatisticsJsonMarshaller();
        return instance;
    }

}
