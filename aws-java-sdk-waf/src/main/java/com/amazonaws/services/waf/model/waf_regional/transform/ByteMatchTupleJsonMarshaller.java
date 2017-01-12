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
package com.amazonaws.services.waf.model.waf_regional.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ByteMatchTupleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchTupleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ByteMatchTuple byteMatchTuple, StructuredJsonGenerator jsonGenerator) {

        if (byteMatchTuple == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (byteMatchTuple.getFieldToMatch() != null) {
                jsonGenerator.writeFieldName("FieldToMatch");
                FieldToMatchJsonMarshaller.getInstance().marshall(byteMatchTuple.getFieldToMatch(), jsonGenerator);
            }
            if (byteMatchTuple.getTargetString() != null) {
                jsonGenerator.writeFieldName("TargetString").writeValue(byteMatchTuple.getTargetString());
            }
            if (byteMatchTuple.getTextTransformation() != null) {
                jsonGenerator.writeFieldName("TextTransformation").writeValue(byteMatchTuple.getTextTransformation());
            }
            if (byteMatchTuple.getPositionalConstraint() != null) {
                jsonGenerator.writeFieldName("PositionalConstraint").writeValue(byteMatchTuple.getPositionalConstraint());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ByteMatchTupleJsonMarshaller instance;

    public static ByteMatchTupleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ByteMatchTupleJsonMarshaller();
        return instance;
    }

}
