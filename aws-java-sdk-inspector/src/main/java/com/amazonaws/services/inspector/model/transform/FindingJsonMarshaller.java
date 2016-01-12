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
 * FindingMarshaller
 */
public class FindingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Finding finding, JSONWriter jsonWriter) {
        if (finding == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (finding.getFindingArn() != null) {
                jsonWriter.key("findingArn").value(finding.getFindingArn());
            }

            if (finding.getRunArn() != null) {
                jsonWriter.key("runArn").value(finding.getRunArn());
            }

            if (finding.getRulesPackageArn() != null) {
                jsonWriter.key("rulesPackageArn").value(
                        finding.getRulesPackageArn());
            }

            if (finding.getRuleName() != null) {
                jsonWriter.key("ruleName").value(finding.getRuleName());
            }

            if (finding.getAgentId() != null) {
                jsonWriter.key("agentId").value(finding.getAgentId());
            }

            if (finding.getAutoScalingGroup() != null) {
                jsonWriter.key("autoScalingGroup").value(
                        finding.getAutoScalingGroup());
            }

            if (finding.getSeverity() != null) {
                jsonWriter.key("severity").value(finding.getSeverity());
            }

            if (finding.getFinding() != null) {
                jsonWriter.key("finding");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getFinding(), jsonWriter);
            }

            if (finding.getDescription() != null) {
                jsonWriter.key("description");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getDescription(), jsonWriter);
            }

            if (finding.getRecommendation() != null) {
                jsonWriter.key("recommendation");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getRecommendation(), jsonWriter);
            }

            java.util.List<Attribute> attributesList = finding.getAttributes();
            if (attributesList != null) {
                jsonWriter.key("attributes");
                jsonWriter.array();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                attributesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<Attribute> userAttributesList = finding
                    .getUserAttributes();
            if (userAttributesList != null) {
                jsonWriter.key("userAttributes");
                jsonWriter.array();
                for (Attribute userAttributesListValue : userAttributesList) {
                    if (userAttributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                userAttributesListValue, jsonWriter);
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

    private static FindingJsonMarshaller instance;

    public static FindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonMarshaller();
        return instance;
    }

}
