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

package com.amazonaws.services.codepipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ActionExecutionMarshaller
 */
public class ActionExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ActionExecution actionExecution, JSONWriter jsonWriter) {
        if (actionExecution == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (actionExecution.getStatus() != null) {
                jsonWriter.key("status").value(actionExecution.getStatus());
            }

            if (actionExecution.getSummary() != null) {
                jsonWriter.key("summary").value(actionExecution.getSummary());
            }

            if (actionExecution.getLastStatusChange() != null) {
                jsonWriter.key("lastStatusChange").value(
                        actionExecution.getLastStatusChange());
            }

            if (actionExecution.getExternalExecutionId() != null) {
                jsonWriter.key("externalExecutionId").value(
                        actionExecution.getExternalExecutionId());
            }

            if (actionExecution.getExternalExecutionUrl() != null) {
                jsonWriter.key("externalExecutionUrl").value(
                        actionExecution.getExternalExecutionUrl());
            }

            if (actionExecution.getPercentComplete() != null) {
                jsonWriter.key("percentComplete").value(
                        actionExecution.getPercentComplete());
            }

            if (actionExecution.getErrorDetails() != null) {
                jsonWriter.key("errorDetails");
                ErrorDetailsJsonMarshaller.getInstance().marshall(
                        actionExecution.getErrorDetails(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionExecutionJsonMarshaller instance;

    public static ActionExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionExecutionJsonMarshaller();
        return instance;
    }

}
