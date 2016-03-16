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

package com.amazonaws.services.databasemigrationservice.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ReplicationTaskStatsMarshaller
 */
public class ReplicationTaskStatsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ReplicationTaskStats replicationTaskStats,
            JSONWriter jsonWriter) {
        if (replicationTaskStats == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (replicationTaskStats.getFullLoadProgressPercent() != null) {
                jsonWriter.key("FullLoadProgressPercent").value(
                        replicationTaskStats.getFullLoadProgressPercent());
            }
            if (replicationTaskStats.getElapsedTimeMillis() != null) {
                jsonWriter.key("ElapsedTimeMillis").value(
                        replicationTaskStats.getElapsedTimeMillis());
            }
            if (replicationTaskStats.getTablesLoaded() != null) {
                jsonWriter.key("TablesLoaded").value(
                        replicationTaskStats.getTablesLoaded());
            }
            if (replicationTaskStats.getTablesLoading() != null) {
                jsonWriter.key("TablesLoading").value(
                        replicationTaskStats.getTablesLoading());
            }
            if (replicationTaskStats.getTablesQueued() != null) {
                jsonWriter.key("TablesQueued").value(
                        replicationTaskStats.getTablesQueued());
            }
            if (replicationTaskStats.getTablesErrored() != null) {
                jsonWriter.key("TablesErrored").value(
                        replicationTaskStats.getTablesErrored());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationTaskStatsJsonMarshaller instance;

    public static ReplicationTaskStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskStatsJsonMarshaller();
        return instance;
    }

}
