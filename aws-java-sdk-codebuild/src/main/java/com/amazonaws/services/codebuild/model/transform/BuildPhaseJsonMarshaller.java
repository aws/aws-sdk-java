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
 * BuildPhaseMarshaller
 */
public class BuildPhaseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BuildPhase buildPhase, StructuredJsonGenerator jsonGenerator) {

        if (buildPhase == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (buildPhase.getPhaseType() != null) {
                jsonGenerator.writeFieldName("phaseType").writeValue(buildPhase.getPhaseType());
            }
            if (buildPhase.getPhaseStatus() != null) {
                jsonGenerator.writeFieldName("phaseStatus").writeValue(buildPhase.getPhaseStatus());
            }
            if (buildPhase.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(buildPhase.getStartTime());
            }
            if (buildPhase.getEndTime() != null) {
                jsonGenerator.writeFieldName("endTime").writeValue(buildPhase.getEndTime());
            }
            if (buildPhase.getDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("durationInSeconds").writeValue(buildPhase.getDurationInSeconds());
            }

            java.util.List<PhaseContext> contextsList = buildPhase.getContexts();
            if (contextsList != null) {
                jsonGenerator.writeFieldName("contexts");
                jsonGenerator.writeStartArray();
                for (PhaseContext contextsListValue : contextsList) {
                    if (contextsListValue != null) {

                        PhaseContextJsonMarshaller.getInstance().marshall(contextsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BuildPhaseJsonMarshaller instance;

    public static BuildPhaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuildPhaseJsonMarshaller();
        return instance;
    }

}
