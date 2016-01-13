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

package com.amazonaws.services.codepipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * JobDataMarshaller
 */
public class JobDataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(JobData jobData, JSONWriter jsonWriter) {
        if (jobData == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (jobData.getActionTypeId() != null) {
                jsonWriter.key("actionTypeId");
                ActionTypeIdJsonMarshaller.getInstance().marshall(
                        jobData.getActionTypeId(), jsonWriter);
            }

            if (jobData.getActionConfiguration() != null) {
                jsonWriter.key("actionConfiguration");
                ActionConfigurationJsonMarshaller.getInstance().marshall(
                        jobData.getActionConfiguration(), jsonWriter);
            }

            if (jobData.getPipelineContext() != null) {
                jsonWriter.key("pipelineContext");
                PipelineContextJsonMarshaller.getInstance().marshall(
                        jobData.getPipelineContext(), jsonWriter);
            }

            java.util.List<Artifact> inputArtifactsList = jobData
                    .getInputArtifacts();
            if (inputArtifactsList != null) {
                jsonWriter.key("inputArtifacts");
                jsonWriter.array();
                for (Artifact inputArtifactsListValue : inputArtifactsList) {
                    if (inputArtifactsListValue != null) {

                        ArtifactJsonMarshaller.getInstance().marshall(
                                inputArtifactsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<Artifact> outputArtifactsList = jobData
                    .getOutputArtifacts();
            if (outputArtifactsList != null) {
                jsonWriter.key("outputArtifacts");
                jsonWriter.array();
                for (Artifact outputArtifactsListValue : outputArtifactsList) {
                    if (outputArtifactsListValue != null) {

                        ArtifactJsonMarshaller.getInstance().marshall(
                                outputArtifactsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (jobData.getArtifactCredentials() != null) {
                jsonWriter.key("artifactCredentials");
                AWSSessionCredentialsJsonMarshaller.getInstance().marshall(
                        jobData.getArtifactCredentials(), jsonWriter);
            }

            if (jobData.getContinuationToken() != null) {
                jsonWriter.key("continuationToken").value(
                        jobData.getContinuationToken());
            }

            if (jobData.getEncryptionKey() != null) {
                jsonWriter.key("encryptionKey");
                EncryptionKeyJsonMarshaller.getInstance().marshall(
                        jobData.getEncryptionKey(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobDataJsonMarshaller instance;

    public static JobDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobDataJsonMarshaller();
        return instance;
    }

}
