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

package com.amazonaws.services.codedeploy.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DiagnosticsMarshaller
 */
public class DiagnosticsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Diagnostics diagnostics, JSONWriter jsonWriter) {
        if (diagnostics == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (diagnostics.getErrorCode() != null) {
                jsonWriter.key("errorCode").value(diagnostics.getErrorCode());
            }

            if (diagnostics.getScriptName() != null) {
                jsonWriter.key("scriptName").value(diagnostics.getScriptName());
            }

            if (diagnostics.getMessage() != null) {
                jsonWriter.key("message").value(diagnostics.getMessage());
            }

            if (diagnostics.getLogTail() != null) {
                jsonWriter.key("logTail").value(diagnostics.getLogTail());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DiagnosticsJsonMarshaller instance;

    public static DiagnosticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiagnosticsJsonMarshaller();
        return instance;
    }

}
