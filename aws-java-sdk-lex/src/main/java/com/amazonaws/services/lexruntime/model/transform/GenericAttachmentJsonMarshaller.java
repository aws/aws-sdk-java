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
 * GenericAttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenericAttachmentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GenericAttachment genericAttachment, StructuredJsonGenerator jsonGenerator) {

        if (genericAttachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (genericAttachment.getTitle() != null) {
                jsonGenerator.writeFieldName("title").writeValue(genericAttachment.getTitle());
            }
            if (genericAttachment.getSubTitle() != null) {
                jsonGenerator.writeFieldName("subTitle").writeValue(genericAttachment.getSubTitle());
            }
            if (genericAttachment.getAttachmentLinkUrl() != null) {
                jsonGenerator.writeFieldName("attachmentLinkUrl").writeValue(genericAttachment.getAttachmentLinkUrl());
            }
            if (genericAttachment.getImageUrl() != null) {
                jsonGenerator.writeFieldName("imageUrl").writeValue(genericAttachment.getImageUrl());
            }

            java.util.List<Button> buttonsList = genericAttachment.getButtons();
            if (buttonsList != null) {
                jsonGenerator.writeFieldName("buttons");
                jsonGenerator.writeStartArray();
                for (Button buttonsListValue : buttonsList) {
                    if (buttonsListValue != null) {

                        ButtonJsonMarshaller.getInstance().marshall(buttonsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GenericAttachmentJsonMarshaller instance;

    public static GenericAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GenericAttachmentJsonMarshaller();
        return instance;
    }

}
