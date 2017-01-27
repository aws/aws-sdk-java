/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * FacetAttributeDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttributeDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FacetAttributeDefinition facetAttributeDefinition, StructuredJsonGenerator jsonGenerator) {

        if (facetAttributeDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (facetAttributeDefinition.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(facetAttributeDefinition.getType());
            }
            if (facetAttributeDefinition.getDefaultValue() != null) {
                jsonGenerator.writeFieldName("DefaultValue");
                TypedAttributeValueJsonMarshaller.getInstance().marshall(facetAttributeDefinition.getDefaultValue(), jsonGenerator);
            }
            if (facetAttributeDefinition.getIsImmutable() != null) {
                jsonGenerator.writeFieldName("IsImmutable").writeValue(facetAttributeDefinition.getIsImmutable());
            }

            java.util.Map<String, Rule> rulesMap = facetAttributeDefinition.getRules();
            if (rulesMap != null) {
                jsonGenerator.writeFieldName("Rules");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Rule> rulesMapValue : rulesMap.entrySet()) {
                    if (rulesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(rulesMapValue.getKey());

                        RuleJsonMarshaller.getInstance().marshall(rulesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FacetAttributeDefinitionJsonMarshaller instance;

    public static FacetAttributeDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FacetAttributeDefinitionJsonMarshaller();
        return instance;
    }

}
