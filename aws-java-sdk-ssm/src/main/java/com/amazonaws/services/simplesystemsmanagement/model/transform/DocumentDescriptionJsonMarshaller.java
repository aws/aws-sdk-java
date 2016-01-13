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
 * DocumentDescriptionMarshaller
 */
public class DocumentDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DocumentDescription documentDescription,
            JSONWriter jsonWriter) {
        if (documentDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (documentDescription.getSha1() != null) {
                jsonWriter.key("Sha1").value(documentDescription.getSha1());
            }

            if (documentDescription.getName() != null) {
                jsonWriter.key("Name").value(documentDescription.getName());
            }

            if (documentDescription.getCreatedDate() != null) {
                jsonWriter.key("CreatedDate").value(
                        documentDescription.getCreatedDate());
            }

            if (documentDescription.getStatus() != null) {
                jsonWriter.key("Status").value(documentDescription.getStatus());
            }

            if (documentDescription.getDescription() != null) {
                jsonWriter.key("Description").value(
                        documentDescription.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DocumentParameter> parametersList = (com.amazonaws.internal.SdkInternalList<DocumentParameter>) documentDescription
                    .getParameters();
            if (!parametersList.isEmpty() || !parametersList.isAutoConstruct()) {
                jsonWriter.key("Parameters");
                jsonWriter.array();
                for (DocumentParameter parametersListValue : parametersList) {
                    if (parametersListValue != null) {

                        DocumentParameterJsonMarshaller.getInstance().marshall(
                                parametersListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> platformTypesList = (com.amazonaws.internal.SdkInternalList<String>) documentDescription
                    .getPlatformTypes();
            if (!platformTypesList.isEmpty()
                    || !platformTypesList.isAutoConstruct()) {
                jsonWriter.key("PlatformTypes");
                jsonWriter.array();
                for (String platformTypesListValue : platformTypesList) {
                    if (platformTypesListValue != null) {
                        jsonWriter.value(platformTypesListValue);
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

    private static DocumentDescriptionJsonMarshaller instance;

    public static DocumentDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonMarshaller();
        return instance;
    }

}
