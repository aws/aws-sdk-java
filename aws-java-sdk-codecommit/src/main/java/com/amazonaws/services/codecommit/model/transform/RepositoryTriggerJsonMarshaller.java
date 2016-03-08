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

package com.amazonaws.services.codecommit.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RepositoryTriggerMarshaller
 */
public class RepositoryTriggerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RepositoryTrigger repositoryTrigger,
            JSONWriter jsonWriter) {
        if (repositoryTrigger == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (repositoryTrigger.getName() != null) {
                jsonWriter.key("name").value(repositoryTrigger.getName());
            }

            if (repositoryTrigger.getDestinationArn() != null) {
                jsonWriter.key("destinationArn").value(
                        repositoryTrigger.getDestinationArn());
            }

            if (repositoryTrigger.getCustomData() != null) {
                jsonWriter.key("customData").value(
                        repositoryTrigger.getCustomData());
            }

            java.util.List<String> branchesList = repositoryTrigger
                    .getBranches();
            if (branchesList != null) {
                jsonWriter.key("branches");
                jsonWriter.array();
                for (String branchesListValue : branchesList) {
                    if (branchesListValue != null) {
                        jsonWriter.value(branchesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> eventsList = repositoryTrigger.getEvents();
            if (eventsList != null) {
                jsonWriter.key("events");
                jsonWriter.array();
                for (String eventsListValue : eventsList) {
                    if (eventsListValue != null) {
                        jsonWriter.value(eventsListValue);
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

    private static RepositoryTriggerJsonMarshaller instance;

    public static RepositoryTriggerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryTriggerJsonMarshaller();
        return instance;
    }

}
