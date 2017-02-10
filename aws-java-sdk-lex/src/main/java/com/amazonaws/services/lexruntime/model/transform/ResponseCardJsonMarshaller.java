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
package com.amazonaws.services.lexruntime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntime.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ResponseCardMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseCardJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ResponseCard responseCard, StructuredJsonGenerator jsonGenerator) {

        if (responseCard == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (responseCard.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(responseCard.getVersion());
            }
            if (responseCard.getContentType() != null) {
                jsonGenerator.writeFieldName("contentType").writeValue(responseCard.getContentType());
            }

            java.util.List<GenericAttachment> genericAttachmentsList = responseCard.getGenericAttachments();
            if (genericAttachmentsList != null) {
                jsonGenerator.writeFieldName("genericAttachments");
                jsonGenerator.writeStartArray();
                for (GenericAttachment genericAttachmentsListValue : genericAttachmentsList) {
                    if (genericAttachmentsListValue != null) {

                        GenericAttachmentJsonMarshaller.getInstance().marshall(genericAttachmentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResponseCardJsonMarshaller instance;

    public static ResponseCardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResponseCardJsonMarshaller();
        return instance;
    }

}
