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
 * TypedAttributeValueRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedAttributeValueRangeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TypedAttributeValueRange typedAttributeValueRange, StructuredJsonGenerator jsonGenerator) {

        if (typedAttributeValueRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (typedAttributeValueRange.getStartMode() != null) {
                jsonGenerator.writeFieldName("StartMode").writeValue(typedAttributeValueRange.getStartMode());
            }
            if (typedAttributeValueRange.getStartValue() != null) {
                jsonGenerator.writeFieldName("StartValue");
                TypedAttributeValueJsonMarshaller.getInstance().marshall(typedAttributeValueRange.getStartValue(), jsonGenerator);
            }
            if (typedAttributeValueRange.getEndMode() != null) {
                jsonGenerator.writeFieldName("EndMode").writeValue(typedAttributeValueRange.getEndMode());
            }
            if (typedAttributeValueRange.getEndValue() != null) {
                jsonGenerator.writeFieldName("EndValue");
                TypedAttributeValueJsonMarshaller.getInstance().marshall(typedAttributeValueRange.getEndValue(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TypedAttributeValueRangeJsonMarshaller instance;

    public static TypedAttributeValueRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TypedAttributeValueRangeJsonMarshaller();
        return instance;
    }

}
