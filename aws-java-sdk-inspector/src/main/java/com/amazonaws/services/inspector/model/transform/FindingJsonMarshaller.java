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
 * FindingMarshaller
 */
public class FindingJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Finding finding, StructuredJsonGenerator jsonGenerator) {

        if (finding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (finding.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(finding.getArn());
            }
            if (finding.getSchemaVersion() != null) {
                jsonGenerator.writeFieldName("schemaVersion").writeValue(finding.getSchemaVersion());
            }
            if (finding.getService() != null) {
                jsonGenerator.writeFieldName("service").writeValue(finding.getService());
            }
            if (finding.getServiceAttributes() != null) {
                jsonGenerator.writeFieldName("serviceAttributes");
                InspectorServiceAttributesJsonMarshaller.getInstance().marshall(finding.getServiceAttributes(), jsonGenerator);
            }
            if (finding.getAssetType() != null) {
                jsonGenerator.writeFieldName("assetType").writeValue(finding.getAssetType());
            }
            if (finding.getAssetAttributes() != null) {
                jsonGenerator.writeFieldName("assetAttributes");
                AssetAttributesJsonMarshaller.getInstance().marshall(finding.getAssetAttributes(), jsonGenerator);
            }
            if (finding.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(finding.getId());
            }
            if (finding.getTitle() != null) {
                jsonGenerator.writeFieldName("title").writeValue(finding.getTitle());
            }
            if (finding.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(finding.getDescription());
            }
            if (finding.getRecommendation() != null) {
                jsonGenerator.writeFieldName("recommendation").writeValue(finding.getRecommendation());
            }
            if (finding.getSeverity() != null) {
                jsonGenerator.writeFieldName("severity").writeValue(finding.getSeverity());
            }
            if (finding.getNumericSeverity() != null) {
                jsonGenerator.writeFieldName("numericSeverity").writeValue(finding.getNumericSeverity());
            }
            if (finding.getConfidence() != null) {
                jsonGenerator.writeFieldName("confidence").writeValue(finding.getConfidence());
            }
            if (finding.getIndicatorOfCompromise() != null) {
                jsonGenerator.writeFieldName("indicatorOfCompromise").writeValue(finding.getIndicatorOfCompromise());
            }

            java.util.List<Attribute> attributesList = finding.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("attributes");
                jsonGenerator.writeStartArray();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> userAttributesList = finding.getUserAttributes();
            if (userAttributesList != null) {
                jsonGenerator.writeFieldName("userAttributes");
                jsonGenerator.writeStartArray();
                for (Attribute userAttributesListValue : userAttributesList) {
                    if (userAttributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(userAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (finding.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(finding.getCreatedAt());
            }
            if (finding.getUpdatedAt() != null) {
                jsonGenerator.writeFieldName("updatedAt").writeValue(finding.getUpdatedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FindingJsonMarshaller instance;

    public static FindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonMarshaller();
        return instance;
    }

}
