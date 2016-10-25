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
 * FindingFilterMarshaller
 */
public class FindingFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FindingFilter findingFilter, StructuredJsonGenerator jsonGenerator) {

        if (findingFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> agentIdsList = findingFilter.getAgentIds();
            if (agentIdsList != null) {
                jsonGenerator.writeFieldName("agentIds");
                jsonGenerator.writeStartArray();
                for (String agentIdsListValue : agentIdsList) {
                    if (agentIdsListValue != null) {
                        jsonGenerator.writeValue(agentIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> autoScalingGroupsList = findingFilter.getAutoScalingGroups();
            if (autoScalingGroupsList != null) {
                jsonGenerator.writeFieldName("autoScalingGroups");
                jsonGenerator.writeStartArray();
                for (String autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {
                        jsonGenerator.writeValue(autoScalingGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> ruleNamesList = findingFilter.getRuleNames();
            if (ruleNamesList != null) {
                jsonGenerator.writeFieldName("ruleNames");
                jsonGenerator.writeStartArray();
                for (String ruleNamesListValue : ruleNamesList) {
                    if (ruleNamesListValue != null) {
                        jsonGenerator.writeValue(ruleNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> severitiesList = findingFilter.getSeverities();
            if (severitiesList != null) {
                jsonGenerator.writeFieldName("severities");
                jsonGenerator.writeStartArray();
                for (String severitiesListValue : severitiesList) {
                    if (severitiesListValue != null) {
                        jsonGenerator.writeValue(severitiesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> rulesPackageArnsList = findingFilter.getRulesPackageArns();
            if (rulesPackageArnsList != null) {
                jsonGenerator.writeFieldName("rulesPackageArns");
                jsonGenerator.writeStartArray();
                for (String rulesPackageArnsListValue : rulesPackageArnsList) {
                    if (rulesPackageArnsListValue != null) {
                        jsonGenerator.writeValue(rulesPackageArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> attributesList = findingFilter.getAttributes();
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

            java.util.List<Attribute> userAttributesList = findingFilter.getUserAttributes();
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
            if (findingFilter.getCreationTimeRange() != null) {
                jsonGenerator.writeFieldName("creationTimeRange");
                TimestampRangeJsonMarshaller.getInstance().marshall(findingFilter.getCreationTimeRange(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FindingFilterJsonMarshaller instance;

    public static FindingFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingFilterJsonMarshaller();
        return instance;
    }

}
