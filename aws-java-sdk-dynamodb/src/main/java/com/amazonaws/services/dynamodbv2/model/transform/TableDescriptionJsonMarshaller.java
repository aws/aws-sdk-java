/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TableDescriptionMarshaller
 */
public class TableDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(TableDescription tableDescription,
            JSONWriter jsonWriter) {
        if (tableDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            java.util.List<AttributeDefinition> attributeDefinitionsList = tableDescription
                    .getAttributeDefinitions();
            if (attributeDefinitionsList != null) {
                jsonWriter.key("AttributeDefinitions");
                jsonWriter.array();
                for (AttributeDefinition attributeDefinitionsListValue : attributeDefinitionsList) {
                    if (attributeDefinitionsListValue != null) {

                        AttributeDefinitionJsonMarshaller.getInstance()
                                .marshall(attributeDefinitionsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (tableDescription.getTableName() != null) {
                jsonWriter.key("TableName").value(
                        tableDescription.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = tableDescription
                    .getKeySchema();
            if (keySchemaList != null) {
                jsonWriter.key("KeySchema");
                jsonWriter.array();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(
                                keySchemaListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (tableDescription.getTableStatus() != null) {
                jsonWriter.key("TableStatus").value(
                        tableDescription.getTableStatus());
            }

            if (tableDescription.getCreationDateTime() != null) {
                jsonWriter.key("CreationDateTime").value(
                        tableDescription.getCreationDateTime());
            }

            if (tableDescription.getProvisionedThroughput() != null) {
                jsonWriter.key("ProvisionedThroughput");
                ProvisionedThroughputDescriptionJsonMarshaller.getInstance()
                        .marshall(tableDescription.getProvisionedThroughput(),
                                jsonWriter);
            }

            if (tableDescription.getTableSizeBytes() != null) {
                jsonWriter.key("TableSizeBytes").value(
                        tableDescription.getTableSizeBytes());
            }

            if (tableDescription.getItemCount() != null) {
                jsonWriter.key("ItemCount").value(
                        tableDescription.getItemCount());
            }

            if (tableDescription.getTableArn() != null) {
                jsonWriter.key("TableArn")
                        .value(tableDescription.getTableArn());
            }

            java.util.List<LocalSecondaryIndexDescription> localSecondaryIndexesList = tableDescription
                    .getLocalSecondaryIndexes();
            if (localSecondaryIndexesList != null) {
                jsonWriter.key("LocalSecondaryIndexes");
                jsonWriter.array();
                for (LocalSecondaryIndexDescription localSecondaryIndexesListValue : localSecondaryIndexesList) {
                    if (localSecondaryIndexesListValue != null) {

                        LocalSecondaryIndexDescriptionJsonMarshaller
                                .getInstance().marshall(
                                        localSecondaryIndexesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<GlobalSecondaryIndexDescription> globalSecondaryIndexesList = tableDescription
                    .getGlobalSecondaryIndexes();
            if (globalSecondaryIndexesList != null) {
                jsonWriter.key("GlobalSecondaryIndexes");
                jsonWriter.array();
                for (GlobalSecondaryIndexDescription globalSecondaryIndexesListValue : globalSecondaryIndexesList) {
                    if (globalSecondaryIndexesListValue != null) {

                        GlobalSecondaryIndexDescriptionJsonMarshaller
                                .getInstance().marshall(
                                        globalSecondaryIndexesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (tableDescription.getStreamSpecification() != null) {
                jsonWriter.key("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(
                        tableDescription.getStreamSpecification(), jsonWriter);
            }

            if (tableDescription.getLatestStreamLabel() != null) {
                jsonWriter.key("LatestStreamLabel").value(
                        tableDescription.getLatestStreamLabel());
            }

            if (tableDescription.getLatestStreamArn() != null) {
                jsonWriter.key("LatestStreamArn").value(
                        tableDescription.getLatestStreamArn());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TableDescriptionJsonMarshaller instance;

    public static TableDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableDescriptionJsonMarshaller();
        return instance;
    }

}
