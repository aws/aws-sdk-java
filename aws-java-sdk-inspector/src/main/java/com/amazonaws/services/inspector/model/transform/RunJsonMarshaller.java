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

package com.amazonaws.services.inspector.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RunMarshaller
 */
public class RunJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Run run, SdkJsonGenerator jsonGenerator) {
        if (run == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (run.getRunArn() != null) {
                jsonGenerator.writeFieldName("runArn").writeValue(
                        run.getRunArn());
            }
            if (run.getRunName() != null) {
                jsonGenerator.writeFieldName("runName").writeValue(
                        run.getRunName());
            }
            if (run.getAssessmentArn() != null) {
                jsonGenerator.writeFieldName("assessmentArn").writeValue(
                        run.getAssessmentArn());
            }
            if (run.getRunState() != null) {
                jsonGenerator.writeFieldName("runState").writeValue(
                        run.getRunState());
            }

            java.util.List<String> rulesPackagesList = run.getRulesPackages();
            if (rulesPackagesList != null) {
                jsonGenerator.writeFieldName("rulesPackages");
                jsonGenerator.writeStartArray();
                for (String rulesPackagesListValue : rulesPackagesList) {
                    if (rulesPackagesListValue != null) {
                        jsonGenerator.writeValue(rulesPackagesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (run.getCreationTime() != null) {
                jsonGenerator.writeFieldName("creationTime").writeValue(
                        run.getCreationTime());
            }
            if (run.getCompletionTime() != null) {
                jsonGenerator.writeFieldName("completionTime").writeValue(
                        run.getCompletionTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RunJsonMarshaller instance;

    public static RunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonMarshaller();
        return instance;
    }

}
