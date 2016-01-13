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
 * RedshiftMetadataMarshaller
 */
public class RedshiftMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RedshiftMetadata redshiftMetadata,
            JSONWriter jsonWriter) {
        if (redshiftMetadata == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (redshiftMetadata.getRedshiftDatabase() != null) {
                jsonWriter.key("RedshiftDatabase");
                RedshiftDatabaseJsonMarshaller.getInstance().marshall(
                        redshiftMetadata.getRedshiftDatabase(), jsonWriter);
            }

            if (redshiftMetadata.getDatabaseUserName() != null) {
                jsonWriter.key("DatabaseUserName").value(
                        redshiftMetadata.getDatabaseUserName());
            }

            if (redshiftMetadata.getSelectSqlQuery() != null) {
                jsonWriter.key("SelectSqlQuery").value(
                        redshiftMetadata.getSelectSqlQuery());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftMetadataJsonMarshaller instance;

    public static RedshiftMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftMetadataJsonMarshaller();
        return instance;
    }

}
