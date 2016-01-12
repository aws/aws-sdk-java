/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DataSourceMarshaller
 */
public class DataSourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DataSource dataSource, JSONWriter jsonWriter) {
        if (dataSource == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (dataSource.getDataSourceId() != null) {
                jsonWriter.key("DataSourceId").value(
                        dataSource.getDataSourceId());
            }

            if (dataSource.getDataLocationS3() != null) {
                jsonWriter.key("DataLocationS3").value(
                        dataSource.getDataLocationS3());
            }

            if (dataSource.getDataRearrangement() != null) {
                jsonWriter.key("DataRearrangement").value(
                        dataSource.getDataRearrangement());
            }

            if (dataSource.getCreatedByIamUser() != null) {
                jsonWriter.key("CreatedByIamUser").value(
                        dataSource.getCreatedByIamUser());
            }

            if (dataSource.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(dataSource.getCreatedAt());
            }

            if (dataSource.getLastUpdatedAt() != null) {
                jsonWriter.key("LastUpdatedAt").value(
                        dataSource.getLastUpdatedAt());
            }

            if (dataSource.getDataSizeInBytes() != null) {
                jsonWriter.key("DataSizeInBytes").value(
                        dataSource.getDataSizeInBytes());
            }

            if (dataSource.getNumberOfFiles() != null) {
                jsonWriter.key("NumberOfFiles").value(
                        dataSource.getNumberOfFiles());
            }

            if (dataSource.getName() != null) {
                jsonWriter.key("Name").value(dataSource.getName());
            }

            if (dataSource.getStatus() != null) {
                jsonWriter.key("Status").value(dataSource.getStatus());
            }

            if (dataSource.getMessage() != null) {
                jsonWriter.key("Message").value(dataSource.getMessage());
            }

            if (dataSource.getRedshiftMetadata() != null) {
                jsonWriter.key("RedshiftMetadata");
                RedshiftMetadataJsonMarshaller.getInstance().marshall(
                        dataSource.getRedshiftMetadata(), jsonWriter);
            }

            if (dataSource.getRDSMetadata() != null) {
                jsonWriter.key("RDSMetadata");
                RDSMetadataJsonMarshaller.getInstance().marshall(
                        dataSource.getRDSMetadata(), jsonWriter);
            }

            if (dataSource.getRoleARN() != null) {
                jsonWriter.key("RoleARN").value(dataSource.getRoleARN());
            }

            if (dataSource.getComputeStatistics() != null) {
                jsonWriter.key("ComputeStatistics").value(
                        dataSource.getComputeStatistics());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DataSourceJsonMarshaller instance;

    public static DataSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonMarshaller();
        return instance;
    }

}
