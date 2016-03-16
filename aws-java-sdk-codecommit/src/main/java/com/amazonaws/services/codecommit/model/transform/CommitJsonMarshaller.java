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
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CommitMarshaller
 */
public class CommitJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Commit commit, JSONWriter jsonWriter) {
        if (commit == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (commit.getTreeId() != null) {
                jsonWriter.key("treeId").value(commit.getTreeId());
            }

            java.util.List<String> parentsList = commit.getParents();
            if (parentsList != null) {
                jsonWriter.key("parents");
                jsonWriter.array();
                for (String parentsListValue : parentsList) {
                    if (parentsListValue != null) {
                        jsonWriter.value(parentsListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (commit.getMessage() != null) {
                jsonWriter.key("message").value(commit.getMessage());
            }
            if (commit.getAuthor() != null) {
                jsonWriter.key("author");
                UserInfoJsonMarshaller.getInstance().marshall(
                        commit.getAuthor(), jsonWriter);
            }
            if (commit.getCommitter() != null) {
                jsonWriter.key("committer");
                UserInfoJsonMarshaller.getInstance().marshall(
                        commit.getCommitter(), jsonWriter);
            }
            if (commit.getAdditionalData() != null) {
                jsonWriter.key("additionalData").value(
                        commit.getAdditionalData());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommitJsonMarshaller instance;

    public static CommitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommitJsonMarshaller();
        return instance;
    }

}
