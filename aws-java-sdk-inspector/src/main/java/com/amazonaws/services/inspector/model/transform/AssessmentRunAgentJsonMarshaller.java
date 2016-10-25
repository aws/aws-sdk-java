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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssessmentRunAgentMarshaller
 */
public class AssessmentRunAgentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentRunAgent assessmentRunAgent, StructuredJsonGenerator jsonGenerator) {

        if (assessmentRunAgent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assessmentRunAgent.getAgentId() != null) {
                jsonGenerator.writeFieldName("agentId").writeValue(assessmentRunAgent.getAgentId());
            }
            if (assessmentRunAgent.getAssessmentRunArn() != null) {
                jsonGenerator.writeFieldName("assessmentRunArn").writeValue(assessmentRunAgent.getAssessmentRunArn());
            }
            if (assessmentRunAgent.getAgentHealth() != null) {
                jsonGenerator.writeFieldName("agentHealth").writeValue(assessmentRunAgent.getAgentHealth());
            }
            if (assessmentRunAgent.getAgentHealthCode() != null) {
                jsonGenerator.writeFieldName("agentHealthCode").writeValue(assessmentRunAgent.getAgentHealthCode());
            }
            if (assessmentRunAgent.getAgentHealthDetails() != null) {
                jsonGenerator.writeFieldName("agentHealthDetails").writeValue(assessmentRunAgent.getAgentHealthDetails());
            }
            if (assessmentRunAgent.getAutoScalingGroup() != null) {
                jsonGenerator.writeFieldName("autoScalingGroup").writeValue(assessmentRunAgent.getAutoScalingGroup());
            }

            java.util.List<TelemetryMetadata> telemetryMetadataList = assessmentRunAgent.getTelemetryMetadata();
            if (telemetryMetadataList != null) {
                jsonGenerator.writeFieldName("telemetryMetadata");
                jsonGenerator.writeStartArray();
                for (TelemetryMetadata telemetryMetadataListValue : telemetryMetadataList) {
                    if (telemetryMetadataListValue != null) {

                        TelemetryMetadataJsonMarshaller.getInstance().marshall(telemetryMetadataListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentRunAgentJsonMarshaller instance;

    public static AssessmentRunAgentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunAgentJsonMarshaller();
        return instance;
    }

}
