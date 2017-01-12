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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.json.*;

/**
 * EffectivePatchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectivePatchJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EffectivePatch effectivePatch, StructuredJsonGenerator jsonGenerator) {

        if (effectivePatch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (effectivePatch.getPatch() != null) {
                jsonGenerator.writeFieldName("Patch");
                PatchJsonMarshaller.getInstance().marshall(effectivePatch.getPatch(), jsonGenerator);
            }
            if (effectivePatch.getPatchStatus() != null) {
                jsonGenerator.writeFieldName("PatchStatus");
                PatchStatusJsonMarshaller.getInstance().marshall(effectivePatch.getPatchStatus(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EffectivePatchJsonMarshaller instance;

    public static EffectivePatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EffectivePatchJsonMarshaller();
        return instance;
    }

}
