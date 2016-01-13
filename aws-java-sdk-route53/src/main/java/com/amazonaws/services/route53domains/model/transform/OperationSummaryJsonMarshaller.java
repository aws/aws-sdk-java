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

package com.amazonaws.services.route53domains.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * OperationSummaryMarshaller
 */
public class OperationSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(OperationSummary operationSummary,
            JSONWriter jsonWriter) {
        if (operationSummary == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (operationSummary.getOperationId() != null) {
                jsonWriter.key("OperationId").value(
                        operationSummary.getOperationId());
            }

            if (operationSummary.getStatus() != null) {
                jsonWriter.key("Status").value(operationSummary.getStatus());
            }

            if (operationSummary.getType() != null) {
                jsonWriter.key("Type").value(operationSummary.getType());
            }

            if (operationSummary.getSubmittedDate() != null) {
                jsonWriter.key("SubmittedDate").value(
                        operationSummary.getSubmittedDate());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OperationSummaryJsonMarshaller instance;

    public static OperationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperationSummaryJsonMarshaller();
        return instance;
    }

}
