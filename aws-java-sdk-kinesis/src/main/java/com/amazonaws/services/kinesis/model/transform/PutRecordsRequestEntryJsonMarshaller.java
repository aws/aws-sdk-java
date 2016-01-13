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

package com.amazonaws.services.kinesis.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PutRecordsRequestEntryMarshaller
 */
public class PutRecordsRequestEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(PutRecordsRequestEntry putRecordsRequestEntry,
            JSONWriter jsonWriter) {
        if (putRecordsRequestEntry == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (putRecordsRequestEntry.getData() != null) {
                jsonWriter.key("Data").value(putRecordsRequestEntry.getData());
            }

            if (putRecordsRequestEntry.getExplicitHashKey() != null) {
                jsonWriter.key("ExplicitHashKey").value(
                        putRecordsRequestEntry.getExplicitHashKey());
            }

            if (putRecordsRequestEntry.getPartitionKey() != null) {
                jsonWriter.key("PartitionKey").value(
                        putRecordsRequestEntry.getPartitionKey());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PutRecordsRequestEntryJsonMarshaller instance;

    public static PutRecordsRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordsRequestEntryJsonMarshaller();
        return instance;
    }

}
