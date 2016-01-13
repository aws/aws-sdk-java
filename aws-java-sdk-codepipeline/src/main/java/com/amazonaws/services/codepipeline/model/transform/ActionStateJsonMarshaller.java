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
 * ActionStateMarshaller
 */
public class ActionStateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ActionState actionState, JSONWriter jsonWriter) {
        if (actionState == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (actionState.getActionName() != null) {
                jsonWriter.key("actionName").value(actionState.getActionName());
            }

            if (actionState.getCurrentRevision() != null) {
                jsonWriter.key("currentRevision");
                ActionRevisionJsonMarshaller.getInstance().marshall(
                        actionState.getCurrentRevision(), jsonWriter);
            }

            if (actionState.getLatestExecution() != null) {
                jsonWriter.key("latestExecution");
                ActionExecutionJsonMarshaller.getInstance().marshall(
                        actionState.getLatestExecution(), jsonWriter);
            }

            if (actionState.getEntityUrl() != null) {
                jsonWriter.key("entityUrl").value(actionState.getEntityUrl());
            }

            if (actionState.getRevisionUrl() != null) {
                jsonWriter.key("revisionUrl").value(
                        actionState.getRevisionUrl());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionStateJsonMarshaller instance;

    public static ActionStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionStateJsonMarshaller();
        return instance;
    }

}
