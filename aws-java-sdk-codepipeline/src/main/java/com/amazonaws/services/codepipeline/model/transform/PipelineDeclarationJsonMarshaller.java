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
 * PipelineDeclarationMarshaller
 */
public class PipelineDeclarationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PipelineDeclaration pipelineDeclaration, StructuredJsonGenerator jsonGenerator) {

        if (pipelineDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (pipelineDeclaration.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(pipelineDeclaration.getName());
            }
            if (pipelineDeclaration.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(pipelineDeclaration.getRoleArn());
            }
            if (pipelineDeclaration.getArtifactStore() != null) {
                jsonGenerator.writeFieldName("artifactStore");
                ArtifactStoreJsonMarshaller.getInstance().marshall(pipelineDeclaration.getArtifactStore(), jsonGenerator);
            }

            java.util.List<StageDeclaration> stagesList = pipelineDeclaration.getStages();
            if (stagesList != null) {
                jsonGenerator.writeFieldName("stages");
                jsonGenerator.writeStartArray();
                for (StageDeclaration stagesListValue : stagesList) {
                    if (stagesListValue != null) {

                        StageDeclarationJsonMarshaller.getInstance().marshall(stagesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (pipelineDeclaration.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(pipelineDeclaration.getVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PipelineDeclarationJsonMarshaller instance;

    public static PipelineDeclarationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineDeclarationJsonMarshaller();
        return instance;
    }

}
