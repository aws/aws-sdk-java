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

package com.amazonaws.services.simplesystemsmanagement.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateAssociationBatchRequestEntryMarshaller
 */
public class CreateAssociationBatchRequestEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry,
            JSONWriter jsonWriter) {
        if (createAssociationBatchRequestEntry == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (createAssociationBatchRequestEntry.getName() != null) {
                jsonWriter.key("Name").value(
                        createAssociationBatchRequestEntry.getName());
            }

            if (createAssociationBatchRequestEntry.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(
                        createAssociationBatchRequestEntry.getInstanceId());
            }

            java.util.Map<String, java.util.List<String>> parametersMap = createAssociationBatchRequestEntry
                    .getParameters();
            if (parametersMap != null) {
                jsonWriter.key("Parameters");
                jsonWriter.object();

                for (Map.Entry<String, java.util.List<String>> parametersMapValue : parametersMap
                        .entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonWriter.key(parametersMapValue.getKey());

                        jsonWriter.array();
                        for (String parametersMapValueList : parametersMapValue
                                .getValue()) {
                            if (parametersMapValueList != null) {
                                jsonWriter.value(parametersMapValueList);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CreateAssociationBatchRequestEntryJsonMarshaller instance;

    public static CreateAssociationBatchRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssociationBatchRequestEntryJsonMarshaller();
        return instance;
    }

}
