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

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StepExecutionStatusDetailMarshaller
 */
public class StepExecutionStatusDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(StepExecutionStatusDetail stepExecutionStatusDetail,
            JSONWriter jsonWriter) {
        if (stepExecutionStatusDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (stepExecutionStatusDetail.getState() != null) {
                jsonWriter.key("State").value(
                        stepExecutionStatusDetail.getState());
            }

            if (stepExecutionStatusDetail.getCreationDateTime() != null) {
                jsonWriter.key("CreationDateTime").value(
                        stepExecutionStatusDetail.getCreationDateTime());
            }

            if (stepExecutionStatusDetail.getStartDateTime() != null) {
                jsonWriter.key("StartDateTime").value(
                        stepExecutionStatusDetail.getStartDateTime());
            }

            if (stepExecutionStatusDetail.getEndDateTime() != null) {
                jsonWriter.key("EndDateTime").value(
                        stepExecutionStatusDetail.getEndDateTime());
            }

            if (stepExecutionStatusDetail.getLastStateChangeReason() != null) {
                jsonWriter.key("LastStateChangeReason").value(
                        stepExecutionStatusDetail.getLastStateChangeReason());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StepExecutionStatusDetailJsonMarshaller instance;

    public static StepExecutionStatusDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionStatusDetailJsonMarshaller();
        return instance;
    }

}
