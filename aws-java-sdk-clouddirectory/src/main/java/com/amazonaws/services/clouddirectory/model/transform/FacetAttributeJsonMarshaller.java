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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * FacetAttributeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttributeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FacetAttribute facetAttribute, StructuredJsonGenerator jsonGenerator) {

        if (facetAttribute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (facetAttribute.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(facetAttribute.getName());
            }
            if (facetAttribute.getAttributeDefinition() != null) {
                jsonGenerator.writeFieldName("AttributeDefinition");
                FacetAttributeDefinitionJsonMarshaller.getInstance().marshall(facetAttribute.getAttributeDefinition(), jsonGenerator);
            }
            if (facetAttribute.getAttributeReference() != null) {
                jsonGenerator.writeFieldName("AttributeReference");
                FacetAttributeReferenceJsonMarshaller.getInstance().marshall(facetAttribute.getAttributeReference(), jsonGenerator);
            }
            if (facetAttribute.getRequiredBehavior() != null) {
                jsonGenerator.writeFieldName("RequiredBehavior").writeValue(facetAttribute.getRequiredBehavior());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FacetAttributeJsonMarshaller instance;

    public static FacetAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FacetAttributeJsonMarshaller();
        return instance;
    }

}
