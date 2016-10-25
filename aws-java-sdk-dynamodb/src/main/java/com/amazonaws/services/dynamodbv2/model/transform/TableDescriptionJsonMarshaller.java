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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TableDescriptionMarshaller
 */
public class TableDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TableDescription tableDescription, StructuredJsonGenerator jsonGenerator) {

        if (tableDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<AttributeDefinition> attributeDefinitionsList = tableDescription.getAttributeDefinitions();
            if (attributeDefinitionsList != null) {
                jsonGenerator.writeFieldName("AttributeDefinitions");
                jsonGenerator.writeStartArray();
                for (AttributeDefinition attributeDefinitionsListValue : attributeDefinitionsList) {
                    if (attributeDefinitionsListValue != null) {

                        AttributeDefinitionJsonMarshaller.getInstance().marshall(attributeDefinitionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (tableDescription.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(tableDescription.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = tableDescription.getKeySchema();
            if (keySchemaList != null) {
                jsonGenerator.writeFieldName("KeySchema");
                jsonGenerator.writeStartArray();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (tableDescription.getTableStatus() != null) {
                jsonGenerator.writeFieldName("TableStatus").writeValue(tableDescription.getTableStatus());
            }
            if (tableDescription.getCreationDateTime() != null) {
                jsonGenerator.writeFieldName("CreationDateTime").writeValue(tableDescription.getCreationDateTime());
            }
            if (tableDescription.getProvisionedThroughput() != null) {
                jsonGenerator.writeFieldName("ProvisionedThroughput");
                ProvisionedThroughputDescriptionJsonMarshaller.getInstance().marshall(tableDescription.getProvisionedThroughput(), jsonGenerator);
            }
            if (tableDescription.getTableSizeBytes() != null) {
                jsonGenerator.writeFieldName("TableSizeBytes").writeValue(tableDescription.getTableSizeBytes());
            }
            if (tableDescription.getItemCount() != null) {
                jsonGenerator.writeFieldName("ItemCount").writeValue(tableDescription.getItemCount());
            }
            if (tableDescription.getTableArn() != null) {
                jsonGenerator.writeFieldName("TableArn").writeValue(tableDescription.getTableArn());
            }

            java.util.List<LocalSecondaryIndexDescription> localSecondaryIndexesList = tableDescription.getLocalSecondaryIndexes();
            if (localSecondaryIndexesList != null) {
                jsonGenerator.writeFieldName("LocalSecondaryIndexes");
                jsonGenerator.writeStartArray();
                for (LocalSecondaryIndexDescription localSecondaryIndexesListValue : localSecondaryIndexesList) {
                    if (localSecondaryIndexesListValue != null) {

                        LocalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(localSecondaryIndexesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<GlobalSecondaryIndexDescription> globalSecondaryIndexesList = tableDescription.getGlobalSecondaryIndexes();
            if (globalSecondaryIndexesList != null) {
                jsonGenerator.writeFieldName("GlobalSecondaryIndexes");
                jsonGenerator.writeStartArray();
                for (GlobalSecondaryIndexDescription globalSecondaryIndexesListValue : globalSecondaryIndexesList) {
                    if (globalSecondaryIndexesListValue != null) {

                        GlobalSecondaryIndexDescriptionJsonMarshaller.getInstance().marshall(globalSecondaryIndexesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (tableDescription.getStreamSpecification() != null) {
                jsonGenerator.writeFieldName("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(tableDescription.getStreamSpecification(), jsonGenerator);
            }
            if (tableDescription.getLatestStreamLabel() != null) {
                jsonGenerator.writeFieldName("LatestStreamLabel").writeValue(tableDescription.getLatestStreamLabel());
            }
            if (tableDescription.getLatestStreamArn() != null) {
                jsonGenerator.writeFieldName("LatestStreamArn").writeValue(tableDescription.getLatestStreamArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TableDescriptionJsonMarshaller instance;

    public static TableDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableDescriptionJsonMarshaller();
        return instance;
    }

}
