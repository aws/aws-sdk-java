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
 * FindingsFilterMarshaller
 */
public class FindingsFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FindingsFilter findingsFilter,
            SdkJsonGenerator jsonGenerator) {
        if (findingsFilter == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> rulesPackageArnsList = findingsFilter
                    .getRulesPackageArns();
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

            java.util.List<String> ruleNamesList = findingsFilter
                    .getRuleNames();
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

            java.util.List<String> severitiesList = findingsFilter
                    .getSeverities();
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

            java.util.List<Attribute> attributesList = findingsFilter
                    .getAttributes();
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

            java.util.List<Attribute> userAttributesList = findingsFilter
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

    private static FindingsFilterJsonMarshaller instance;

    public static FindingsFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingsFilterJsonMarshaller();
        return instance;
    }

}
