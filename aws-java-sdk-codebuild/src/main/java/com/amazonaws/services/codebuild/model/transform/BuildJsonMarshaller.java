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
package com.amazonaws.services.codebuild.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BuildMarshaller
 */
public class BuildJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Build build, StructuredJsonGenerator jsonGenerator) {

        if (build == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (build.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(build.getId());
            }
            if (build.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(build.getArn());
            }
            if (build.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(build.getStartTime());
            }
            if (build.getEndTime() != null) {
                jsonGenerator.writeFieldName("endTime").writeValue(build.getEndTime());
            }
            if (build.getCurrentPhase() != null) {
                jsonGenerator.writeFieldName("currentPhase").writeValue(build.getCurrentPhase());
            }
            if (build.getBuildStatus() != null) {
                jsonGenerator.writeFieldName("buildStatus").writeValue(build.getBuildStatus());
            }
            if (build.getSourceVersion() != null) {
                jsonGenerator.writeFieldName("sourceVersion").writeValue(build.getSourceVersion());
            }
            if (build.getProjectName() != null) {
                jsonGenerator.writeFieldName("projectName").writeValue(build.getProjectName());
            }

            java.util.List<BuildPhase> phasesList = build.getPhases();
            if (phasesList != null) {
                jsonGenerator.writeFieldName("phases");
                jsonGenerator.writeStartArray();
                for (BuildPhase phasesListValue : phasesList) {
                    if (phasesListValue != null) {

                        BuildPhaseJsonMarshaller.getInstance().marshall(phasesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (build.getSource() != null) {
                jsonGenerator.writeFieldName("source");
                ProjectSourceJsonMarshaller.getInstance().marshall(build.getSource(), jsonGenerator);
            }
            if (build.getArtifacts() != null) {
                jsonGenerator.writeFieldName("artifacts");
                BuildArtifactsJsonMarshaller.getInstance().marshall(build.getArtifacts(), jsonGenerator);
            }
            if (build.getEnvironment() != null) {
                jsonGenerator.writeFieldName("environment");
                ProjectEnvironmentJsonMarshaller.getInstance().marshall(build.getEnvironment(), jsonGenerator);
            }
            if (build.getLogs() != null) {
                jsonGenerator.writeFieldName("logs");
                LogsLocationJsonMarshaller.getInstance().marshall(build.getLogs(), jsonGenerator);
            }
            if (build.getTimeoutInMinutes() != null) {
                jsonGenerator.writeFieldName("timeoutInMinutes").writeValue(build.getTimeoutInMinutes());
            }
            if (build.getBuildComplete() != null) {
                jsonGenerator.writeFieldName("buildComplete").writeValue(build.getBuildComplete());
            }
            if (build.getInitiator() != null) {
                jsonGenerator.writeFieldName("initiator").writeValue(build.getInitiator());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BuildJsonMarshaller instance;

    public static BuildJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuildJsonMarshaller();
        return instance;
    }

}
