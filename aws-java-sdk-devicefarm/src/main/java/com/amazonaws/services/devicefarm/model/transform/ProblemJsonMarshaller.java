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

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ProblemMarshaller
 */
public class ProblemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Problem problem, JSONWriter jsonWriter) {
        if (problem == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (problem.getRun() != null) {
                jsonWriter.key("run");
                ProblemDetailJsonMarshaller.getInstance().marshall(
                        problem.getRun(), jsonWriter);
            }

            if (problem.getJob() != null) {
                jsonWriter.key("job");
                ProblemDetailJsonMarshaller.getInstance().marshall(
                        problem.getJob(), jsonWriter);
            }

            if (problem.getSuite() != null) {
                jsonWriter.key("suite");
                ProblemDetailJsonMarshaller.getInstance().marshall(
                        problem.getSuite(), jsonWriter);
            }

            if (problem.getTest() != null) {
                jsonWriter.key("test");
                ProblemDetailJsonMarshaller.getInstance().marshall(
                        problem.getTest(), jsonWriter);
            }

            if (problem.getDevice() != null) {
                jsonWriter.key("device");
                DeviceJsonMarshaller.getInstance().marshall(
                        problem.getDevice(), jsonWriter);
            }

            if (problem.getResult() != null) {
                jsonWriter.key("result").value(problem.getResult());
            }

            if (problem.getMessage() != null) {
                jsonWriter.key("message").value(problem.getMessage());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProblemJsonMarshaller instance;

    public static ProblemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProblemJsonMarshaller();
        return instance;
    }

}
