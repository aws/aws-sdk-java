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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StackSummaryMarshaller
 */
public class StackSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(StackSummary stackSummary, JSONWriter jsonWriter) {
        if (stackSummary == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (stackSummary.getStackId() != null) {
                jsonWriter.key("StackId").value(stackSummary.getStackId());
            }

            if (stackSummary.getName() != null) {
                jsonWriter.key("Name").value(stackSummary.getName());
            }

            if (stackSummary.getArn() != null) {
                jsonWriter.key("Arn").value(stackSummary.getArn());
            }

            if (stackSummary.getLayersCount() != null) {
                jsonWriter.key("LayersCount").value(
                        stackSummary.getLayersCount());
            }

            if (stackSummary.getAppsCount() != null) {
                jsonWriter.key("AppsCount").value(stackSummary.getAppsCount());
            }

            if (stackSummary.getInstancesCount() != null) {
                jsonWriter.key("InstancesCount");
                InstancesCountJsonMarshaller.getInstance().marshall(
                        stackSummary.getInstancesCount(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StackSummaryJsonMarshaller instance;

    public static StackSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StackSummaryJsonMarshaller();
        return instance;
    }

}
