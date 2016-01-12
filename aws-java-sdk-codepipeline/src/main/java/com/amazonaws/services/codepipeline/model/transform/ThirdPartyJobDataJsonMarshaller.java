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
 * ThirdPartyJobDataMarshaller
 */
public class ThirdPartyJobDataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ThirdPartyJobData thirdPartyJobData,
            JSONWriter jsonWriter) {
        if (thirdPartyJobData == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (thirdPartyJobData.getActionTypeId() != null) {
                jsonWriter.key("actionTypeId");
                ActionTypeIdJsonMarshaller.getInstance().marshall(
                        thirdPartyJobData.getActionTypeId(), jsonWriter);
            }

            if (thirdPartyJobData.getActionConfiguration() != null) {
                jsonWriter.key("actionConfiguration");
                ActionConfigurationJsonMarshaller.getInstance().marshall(
                        thirdPartyJobData.getActionConfiguration(), jsonWriter);
            }

            if (thirdPartyJobData.getPipelineContext() != null) {
                jsonWriter.key("pipelineContext");
                PipelineContextJsonMarshaller.getInstance().marshall(
                        thirdPartyJobData.getPipelineContext(), jsonWriter);
            }

            java.util.List<Artifact> inputArtifactsList = thirdPartyJobData
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

            java.util.List<Artifact> outputArtifactsList = thirdPartyJobData
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

            if (thirdPartyJobData.getArtifactCredentials() != null) {
                jsonWriter.key("artifactCredentials");
                AWSSessionCredentialsJsonMarshaller.getInstance().marshall(
                        thirdPartyJobData.getArtifactCredentials(), jsonWriter);
            }

            if (thirdPartyJobData.getContinuationToken() != null) {
                jsonWriter.key("continuationToken").value(
                        thirdPartyJobData.getContinuationToken());
            }

            if (thirdPartyJobData.getEncryptionKey() != null) {
                jsonWriter.key("encryptionKey");
                EncryptionKeyJsonMarshaller.getInstance().marshall(
                        thirdPartyJobData.getEncryptionKey(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ThirdPartyJobDataJsonMarshaller instance;

    public static ThirdPartyJobDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThirdPartyJobDataJsonMarshaller();
        return instance;
    }

}
