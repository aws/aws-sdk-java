/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InventoryDeletionStatusItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InventoryDeletionStatusItemMarshaller {

    private static final MarshallingInfo<String> DELETIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionId").build();
    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TypeName").build();
    private static final MarshallingInfo<java.util.Date> DELETIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStatus").build();
    private static final MarshallingInfo<String> LASTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStatusMessage").build();
    private static final MarshallingInfo<StructuredPojo> DELETIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionSummary").build();
    private static final MarshallingInfo<java.util.Date> LASTSTATUSUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStatusUpdateTime").timestampFormat("unixTimestamp").build();

    private static final InventoryDeletionStatusItemMarshaller instance = new InventoryDeletionStatusItemMarshaller();

    public static InventoryDeletionStatusItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InventoryDeletionStatusItem inventoryDeletionStatusItem, ProtocolMarshaller protocolMarshaller) {

        if (inventoryDeletionStatusItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getDeletionId(), DELETIONID_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getTypeName(), TYPENAME_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getDeletionStartTime(), DELETIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getLastStatusMessage(), LASTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getDeletionSummary(), DELETIONSUMMARY_BINDING);
            protocolMarshaller.marshall(inventoryDeletionStatusItem.getLastStatusUpdateTime(), LASTSTATUSUPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
