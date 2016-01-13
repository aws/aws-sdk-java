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

package com.amazonaws.services.cognitosync.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DatasetMarshaller
 */
public class DatasetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Dataset dataset, JSONWriter jsonWriter) {
        if (dataset == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (dataset.getIdentityId() != null) {
                jsonWriter.key("IdentityId").value(dataset.getIdentityId());
            }

            if (dataset.getDatasetName() != null) {
                jsonWriter.key("DatasetName").value(dataset.getDatasetName());
            }

            if (dataset.getCreationDate() != null) {
                jsonWriter.key("CreationDate").value(dataset.getCreationDate());
            }

            if (dataset.getLastModifiedDate() != null) {
                jsonWriter.key("LastModifiedDate").value(
                        dataset.getLastModifiedDate());
            }

            if (dataset.getLastModifiedBy() != null) {
                jsonWriter.key("LastModifiedBy").value(
                        dataset.getLastModifiedBy());
            }

            if (dataset.getDataStorage() != null) {
                jsonWriter.key("DataStorage").value(dataset.getDataStorage());
            }

            if (dataset.getNumRecords() != null) {
                jsonWriter.key("NumRecords").value(dataset.getNumRecords());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DatasetJsonMarshaller instance;

    public static DatasetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonMarshaller();
        return instance;
    }

}
