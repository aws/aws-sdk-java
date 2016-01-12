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

package com.amazonaws.services.datapipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PipelineDescriptionMarshaller
 */
public class PipelineDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(PipelineDescription pipelineDescription,
            JSONWriter jsonWriter) {
        if (pipelineDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (pipelineDescription.getPipelineId() != null) {
                jsonWriter.key("pipelineId").value(
                        pipelineDescription.getPipelineId());
            }

            if (pipelineDescription.getName() != null) {
                jsonWriter.key("name").value(pipelineDescription.getName());
            }

            com.amazonaws.internal.SdkInternalList<Field> fieldsList = (com.amazonaws.internal.SdkInternalList<Field>) pipelineDescription
                    .getFields();
            if (!fieldsList.isEmpty() || !fieldsList.isAutoConstruct()) {
                jsonWriter.key("fields");
                jsonWriter.array();
                for (Field fieldsListValue : fieldsList) {
                    if (fieldsListValue != null) {

                        FieldJsonMarshaller.getInstance().marshall(
                                fieldsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (pipelineDescription.getDescription() != null) {
                jsonWriter.key("description").value(
                        pipelineDescription.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) pipelineDescription
                    .getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonWriter.key("tags");
                jsonWriter.array();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PipelineDescriptionJsonMarshaller instance;

    public static PipelineDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineDescriptionJsonMarshaller();
        return instance;
    }

}
