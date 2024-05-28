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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingHistoryRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingHistoryRecordMarshaller {

    private static final MarshallingInfo<StructuredPojo> FINDINGIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindingIdentifier").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Boolean> FINDINGCREATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindingCreated").build();
    private static final MarshallingInfo<StructuredPojo> UPDATESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateSource").build();
    private static final MarshallingInfo<List> UPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Updates").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final FindingHistoryRecordMarshaller instance = new FindingHistoryRecordMarshaller();

    public static FindingHistoryRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingHistoryRecord findingHistoryRecord, ProtocolMarshaller protocolMarshaller) {

        if (findingHistoryRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingHistoryRecord.getFindingIdentifier(), FINDINGIDENTIFIER_BINDING);
            protocolMarshaller.marshall(findingHistoryRecord.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(findingHistoryRecord.getFindingCreated(), FINDINGCREATED_BINDING);
            protocolMarshaller.marshall(findingHistoryRecord.getUpdateSource(), UPDATESOURCE_BINDING);
            protocolMarshaller.marshall(findingHistoryRecord.getUpdates(), UPDATES_BINDING);
            protocolMarshaller.marshall(findingHistoryRecord.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
