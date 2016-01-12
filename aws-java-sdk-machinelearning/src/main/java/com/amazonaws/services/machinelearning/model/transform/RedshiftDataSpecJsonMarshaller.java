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
 * RedshiftDataSpecMarshaller
 */
public class RedshiftDataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RedshiftDataSpec redshiftDataSpec,
            JSONWriter jsonWriter) {
        if (redshiftDataSpec == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (redshiftDataSpec.getDatabaseInformation() != null) {
                jsonWriter.key("DatabaseInformation");
                RedshiftDatabaseJsonMarshaller.getInstance().marshall(
                        redshiftDataSpec.getDatabaseInformation(), jsonWriter);
            }

            if (redshiftDataSpec.getSelectSqlQuery() != null) {
                jsonWriter.key("SelectSqlQuery").value(
                        redshiftDataSpec.getSelectSqlQuery());
            }

            if (redshiftDataSpec.getDatabaseCredentials() != null) {
                jsonWriter.key("DatabaseCredentials");
                RedshiftDatabaseCredentialsJsonMarshaller.getInstance()
                        .marshall(redshiftDataSpec.getDatabaseCredentials(),
                                jsonWriter);
            }

            if (redshiftDataSpec.getS3StagingLocation() != null) {
                jsonWriter.key("S3StagingLocation").value(
                        redshiftDataSpec.getS3StagingLocation());
            }

            if (redshiftDataSpec.getDataRearrangement() != null) {
                jsonWriter.key("DataRearrangement").value(
                        redshiftDataSpec.getDataRearrangement());
            }

            if (redshiftDataSpec.getDataSchema() != null) {
                jsonWriter.key("DataSchema").value(
                        redshiftDataSpec.getDataSchema());
            }

            if (redshiftDataSpec.getDataSchemaUri() != null) {
                jsonWriter.key("DataSchemaUri").value(
                        redshiftDataSpec.getDataSchemaUri());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDataSpecJsonMarshaller instance;

    public static RedshiftDataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDataSpecJsonMarshaller();
        return instance;
    }

}
