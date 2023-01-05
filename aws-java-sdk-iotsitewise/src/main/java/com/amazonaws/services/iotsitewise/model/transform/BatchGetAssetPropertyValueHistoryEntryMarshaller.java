/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchGetAssetPropertyValueHistoryEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetAssetPropertyValueHistoryEntryMarshaller {

    private static final MarshallingInfo<String> ENTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entryId").build();
    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> PROPERTYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyId").build();
    private static final MarshallingInfo<String> PROPERTYALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyAlias").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> QUALITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("qualities").build();
    private static final MarshallingInfo<String> TIMEORDERING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeOrdering").build();

    private static final BatchGetAssetPropertyValueHistoryEntryMarshaller instance = new BatchGetAssetPropertyValueHistoryEntryMarshaller();

    public static BatchGetAssetPropertyValueHistoryEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetAssetPropertyValueHistoryEntry batchGetAssetPropertyValueHistoryEntry, ProtocolMarshaller protocolMarshaller) {

        if (batchGetAssetPropertyValueHistoryEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getEntryId(), ENTRYID_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getPropertyId(), PROPERTYID_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getPropertyAlias(), PROPERTYALIAS_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getQualities(), QUALITIES_BINDING);
            protocolMarshaller.marshall(batchGetAssetPropertyValueHistoryEntry.getTimeOrdering(), TIMEORDERING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
