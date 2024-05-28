/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RowMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RowMarshaller {

    private static final MarshallingInfo<String> ARCHIVEDMESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchivedMessageId").build();
    private static final MarshallingInfo<String> CC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cc").build();
    private static final MarshallingInfo<String> DATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Date").build();
    private static final MarshallingInfo<String> FROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("From").build();
    private static final MarshallingInfo<Boolean> HASATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasAttachments").build();
    private static final MarshallingInfo<String> INREPLYTO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InReplyTo").build();
    private static final MarshallingInfo<String> MESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MessageId").build();
    private static final MarshallingInfo<List> RECEIVEDHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceivedHeaders").build();
    private static final MarshallingInfo<java.util.Date> RECEIVEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceivedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<String> TO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("To").build();
    private static final MarshallingInfo<String> XMAILER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("XMailer").build();
    private static final MarshallingInfo<String> XORIGINALMAILER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XOriginalMailer").build();
    private static final MarshallingInfo<String> XPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("XPriority").build();

    private static final RowMarshaller instance = new RowMarshaller();

    public static RowMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Row row, ProtocolMarshaller protocolMarshaller) {

        if (row == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(row.getArchivedMessageId(), ARCHIVEDMESSAGEID_BINDING);
            protocolMarshaller.marshall(row.getCc(), CC_BINDING);
            protocolMarshaller.marshall(row.getDate(), DATE_BINDING);
            protocolMarshaller.marshall(row.getFrom(), FROM_BINDING);
            protocolMarshaller.marshall(row.getHasAttachments(), HASATTACHMENTS_BINDING);
            protocolMarshaller.marshall(row.getInReplyTo(), INREPLYTO_BINDING);
            protocolMarshaller.marshall(row.getMessageId(), MESSAGEID_BINDING);
            protocolMarshaller.marshall(row.getReceivedHeaders(), RECEIVEDHEADERS_BINDING);
            protocolMarshaller.marshall(row.getReceivedTimestamp(), RECEIVEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(row.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(row.getTo(), TO_BINDING);
            protocolMarshaller.marshall(row.getXMailer(), XMAILER_BINDING);
            protocolMarshaller.marshall(row.getXOriginalMailer(), XORIGINALMAILER_BINDING);
            protocolMarshaller.marshall(row.getXPriority(), XPRIORITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
