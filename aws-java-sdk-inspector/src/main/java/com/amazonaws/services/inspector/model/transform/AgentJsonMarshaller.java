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
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AgentMarshaller
 */
public class AgentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Agent agent, JSONWriter jsonWriter) {
        if (agent == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (agent.getAgentId() != null) {
                jsonWriter.key("agentId").value(agent.getAgentId());
            }

            if (agent.getAssessmentArn() != null) {
                jsonWriter.key("assessmentArn").value(agent.getAssessmentArn());
            }

            if (agent.getAgentHealth() != null) {
                jsonWriter.key("agentHealth").value(agent.getAgentHealth());
            }

            if (agent.getAgentHealthCode() != null) {
                jsonWriter.key("agentHealthCode").value(
                        agent.getAgentHealthCode());
            }

            if (agent.getAgentHealthDetails() != null) {
                jsonWriter.key("agentHealthDetails").value(
                        agent.getAgentHealthDetails());
            }

            if (agent.getAutoScalingGroup() != null) {
                jsonWriter.key("autoScalingGroup").value(
                        agent.getAutoScalingGroup());
            }

            if (agent.getAccountId() != null) {
                jsonWriter.key("accountId").value(agent.getAccountId());
            }

            java.util.List<Telemetry> telemetryList = agent.getTelemetry();
            if (telemetryList != null) {
                jsonWriter.key("telemetry");
                jsonWriter.array();
                for (Telemetry telemetryListValue : telemetryList) {
                    if (telemetryListValue != null) {

                        TelemetryJsonMarshaller.getInstance().marshall(
                                telemetryListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AgentJsonMarshaller instance;

    public static AgentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentJsonMarshaller();
        return instance;
    }

}
