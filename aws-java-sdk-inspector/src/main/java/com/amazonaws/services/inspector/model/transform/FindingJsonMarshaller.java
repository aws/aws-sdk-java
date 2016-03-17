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
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * FindingMarshaller
 */
public class FindingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Finding finding, SdkJsonGenerator jsonGenerator) {
        if (finding == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (finding.getFindingArn() != null) {
                jsonGenerator.writeFieldName("findingArn").writeValue(
                        finding.getFindingArn());
            }
            if (finding.getRunArn() != null) {
                jsonGenerator.writeFieldName("runArn").writeValue(
                        finding.getRunArn());
            }
            if (finding.getRulesPackageArn() != null) {
                jsonGenerator.writeFieldName("rulesPackageArn").writeValue(
                        finding.getRulesPackageArn());
            }
            if (finding.getRuleName() != null) {
                jsonGenerator.writeFieldName("ruleName").writeValue(
                        finding.getRuleName());
            }
            if (finding.getAgentId() != null) {
                jsonGenerator.writeFieldName("agentId").writeValue(
                        finding.getAgentId());
            }
            if (finding.getAutoScalingGroup() != null) {
                jsonGenerator.writeFieldName("autoScalingGroup").writeValue(
                        finding.getAutoScalingGroup());
            }
            if (finding.getSeverity() != null) {
                jsonGenerator.writeFieldName("severity").writeValue(
                        finding.getSeverity());
            }
            if (finding.getFinding() != null) {
                jsonGenerator.writeFieldName("finding");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getFinding(), jsonGenerator);
            }
            if (finding.getDescription() != null) {
                jsonGenerator.writeFieldName("description");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getDescription(), jsonGenerator);
            }
            if (finding.getRecommendation() != null) {
                jsonGenerator.writeFieldName("recommendation");
                LocalizedTextJsonMarshaller.getInstance().marshall(
                        finding.getRecommendation(), jsonGenerator);
            }

            java.util.List<Attribute> attributesList = finding.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("attributes");
                jsonGenerator.writeStartArray();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> userAttributesList = finding
                    .getUserAttributes();
            if (userAttributesList != null) {
                jsonGenerator.writeFieldName("userAttributes");
                jsonGenerator.writeStartArray();
                for (Attribute userAttributesListValue : userAttributesList) {
                    if (userAttributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(
                                userAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
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
