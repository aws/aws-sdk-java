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
 * PipelineExecutionMarshaller
 */
public class PipelineExecutionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PipelineExecution pipelineExecution, StructuredJsonGenerator jsonGenerator) {

        if (pipelineExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (pipelineExecution.getPipelineName() != null) {
                jsonGenerator.writeFieldName("pipelineName").writeValue(pipelineExecution.getPipelineName());
            }
            if (pipelineExecution.getPipelineVersion() != null) {
                jsonGenerator.writeFieldName("pipelineVersion").writeValue(pipelineExecution.getPipelineVersion());
            }
            if (pipelineExecution.getPipelineExecutionId() != null) {
                jsonGenerator.writeFieldName("pipelineExecutionId").writeValue(pipelineExecution.getPipelineExecutionId());
            }
            if (pipelineExecution.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(pipelineExecution.getStatus());
            }

            java.util.List<ArtifactRevision> artifactRevisionsList = pipelineExecution.getArtifactRevisions();
            if (artifactRevisionsList != null) {
                jsonGenerator.writeFieldName("artifactRevisions");
                jsonGenerator.writeStartArray();
                for (ArtifactRevision artifactRevisionsListValue : artifactRevisionsList) {
                    if (artifactRevisionsListValue != null) {

                        ArtifactRevisionJsonMarshaller.getInstance().marshall(artifactRevisionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PipelineExecutionJsonMarshaller instance;

    public static PipelineExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineExecutionJsonMarshaller();
        return instance;
    }

}
