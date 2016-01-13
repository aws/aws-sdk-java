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

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DirectoryLimitsMarshaller
 */
public class DirectoryLimitsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DirectoryLimits directoryLimits, JSONWriter jsonWriter) {
        if (directoryLimits == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (directoryLimits.getCloudOnlyDirectoriesLimit() != null) {
                jsonWriter.key("CloudOnlyDirectoriesLimit").value(
                        directoryLimits.getCloudOnlyDirectoriesLimit());
            }

            if (directoryLimits.getCloudOnlyDirectoriesCurrentCount() != null) {
                jsonWriter.key("CloudOnlyDirectoriesCurrentCount").value(
                        directoryLimits.getCloudOnlyDirectoriesCurrentCount());
            }

            if (directoryLimits.getCloudOnlyDirectoriesLimitReached() != null) {
                jsonWriter.key("CloudOnlyDirectoriesLimitReached").value(
                        directoryLimits.getCloudOnlyDirectoriesLimitReached());
            }

            if (directoryLimits.getCloudOnlyMicrosoftADLimit() != null) {
                jsonWriter.key("CloudOnlyMicrosoftADLimit").value(
                        directoryLimits.getCloudOnlyMicrosoftADLimit());
            }

            if (directoryLimits.getCloudOnlyMicrosoftADCurrentCount() != null) {
                jsonWriter.key("CloudOnlyMicrosoftADCurrentCount").value(
                        directoryLimits.getCloudOnlyMicrosoftADCurrentCount());
            }

            if (directoryLimits.getCloudOnlyMicrosoftADLimitReached() != null) {
                jsonWriter.key("CloudOnlyMicrosoftADLimitReached").value(
                        directoryLimits.getCloudOnlyMicrosoftADLimitReached());
            }

            if (directoryLimits.getConnectedDirectoriesLimit() != null) {
                jsonWriter.key("ConnectedDirectoriesLimit").value(
                        directoryLimits.getConnectedDirectoriesLimit());
            }

            if (directoryLimits.getConnectedDirectoriesCurrentCount() != null) {
                jsonWriter.key("ConnectedDirectoriesCurrentCount").value(
                        directoryLimits.getConnectedDirectoriesCurrentCount());
            }

            if (directoryLimits.getConnectedDirectoriesLimitReached() != null) {
                jsonWriter.key("ConnectedDirectoriesLimitReached").value(
                        directoryLimits.getConnectedDirectoriesLimitReached());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryLimitsJsonMarshaller instance;

    public static DirectoryLimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryLimitsJsonMarshaller();
        return instance;
    }

}
