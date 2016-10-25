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
package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CommunicationMarshaller
 */
public class CommunicationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Communication communication, StructuredJsonGenerator jsonGenerator) {

        if (communication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (communication.getCaseId() != null) {
                jsonGenerator.writeFieldName("caseId").writeValue(communication.getCaseId());
            }
            if (communication.getBody() != null) {
                jsonGenerator.writeFieldName("body").writeValue(communication.getBody());
            }
            if (communication.getSubmittedBy() != null) {
                jsonGenerator.writeFieldName("submittedBy").writeValue(communication.getSubmittedBy());
            }
            if (communication.getTimeCreated() != null) {
                jsonGenerator.writeFieldName("timeCreated").writeValue(communication.getTimeCreated());
            }

            com.amazonaws.internal.SdkInternalList<AttachmentDetails> attachmentSetList = (com.amazonaws.internal.SdkInternalList<AttachmentDetails>) communication
                    .getAttachmentSet();
            if (!attachmentSetList.isEmpty() || !attachmentSetList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("attachmentSet");
                jsonGenerator.writeStartArray();
                for (AttachmentDetails attachmentSetListValue : attachmentSetList) {
                    if (attachmentSetListValue != null) {

                        AttachmentDetailsJsonMarshaller.getInstance().marshall(attachmentSetListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommunicationJsonMarshaller instance;

    public static CommunicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommunicationJsonMarshaller();
        return instance;
    }

}
