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

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * S3DataSpecMarshaller
 */
public class S3DataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(S3DataSpec s3DataSpec, JSONWriter jsonWriter) {
        if (s3DataSpec == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (s3DataSpec.getDataLocationS3() != null) {
                jsonWriter.key("DataLocationS3").value(
                        s3DataSpec.getDataLocationS3());
            }

            if (s3DataSpec.getDataRearrangement() != null) {
                jsonWriter.key("DataRearrangement").value(
                        s3DataSpec.getDataRearrangement());
            }

            if (s3DataSpec.getDataSchema() != null) {
                jsonWriter.key("DataSchema").value(s3DataSpec.getDataSchema());
            }

            if (s3DataSpec.getDataSchemaLocationS3() != null) {
                jsonWriter.key("DataSchemaLocationS3").value(
                        s3DataSpec.getDataSchemaLocationS3());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DataSpecJsonMarshaller instance;

    public static S3DataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSpecJsonMarshaller();
        return instance;
    }

}
