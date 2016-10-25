/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ThirdPartyJobDataMarshaller
 */
public class ThirdPartyJobDataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ThirdPartyJobData thirdPartyJobData, StructuredJsonGenerator jsonGenerator) {

        if (thirdPartyJobData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (thirdPartyJobData.getActionTypeId() != null) {
                jsonGenerator.writeFieldName("actionTypeId");
                ActionTypeIdJsonMarshaller.getInstance().marshall(thirdPartyJobData.getActionTypeId(), jsonGenerator);
            }
            if (thirdPartyJobData.getActionConfiguration() != null) {
                jsonGenerator.writeFieldName("actionConfiguration");
                ActionConfigurationJsonMarshaller.getInstance().marshall(thirdPartyJobData.getActionConfiguration(), jsonGenerator);
            }
            if (thirdPartyJobData.getPipelineContext() != null) {
                jsonGenerator.writeFieldName("pipelineContext");
                PipelineContextJsonMarshaller.getInstance().marshall(thirdPartyJobData.getPipelineContext(), jsonGenerator);
            }

            java.util.List<Artifact> inputArtifactsList = thirdPartyJobData.getInputArtifacts();
            if (inputArtifactsList != null) {
                jsonGenerator.writeFieldName("inputArtifacts");
                jsonGenerator.writeStartArray();
                for (Artifact inputArtifactsListValue : inputArtifactsList) {
                    if (inputArtifactsListValue != null) {

                        ArtifactJsonMarshaller.getInstance().marshall(inputArtifactsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Artifact> outputArtifactsList = thirdPartyJobData.getOutputArtifacts();
            if (outputArtifactsList != null) {
                jsonGenerator.writeFieldName("outputArtifacts");
                jsonGenerator.writeStartArray();
                for (Artifact outputArtifactsListValue : outputArtifactsList) {
                    if (outputArtifactsListValue != null) {

                        ArtifactJsonMarshaller.getInstance().marshall(outputArtifactsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (thirdPartyJobData.getArtifactCredentials() != null) {
                jsonGenerator.writeFieldName("artifactCredentials");
                AWSSessionCredentialsJsonMarshaller.getInstance().marshall(thirdPartyJobData.getArtifactCredentials(), jsonGenerator);
            }
            if (thirdPartyJobData.getContinuationToken() != null) {
                jsonGenerator.writeFieldName("continuationToken").writeValue(thirdPartyJobData.getContinuationToken());
            }
            if (thirdPartyJobData.getEncryptionKey() != null) {
                jsonGenerator.writeFieldName("encryptionKey");
                EncryptionKeyJsonMarshaller.getInstance().marshall(thirdPartyJobData.getEncryptionKey(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ThirdPartyJobDataJsonMarshaller instance;

    public static ThirdPartyJobDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThirdPartyJobDataJsonMarshaller();
        return instance;
    }

}
