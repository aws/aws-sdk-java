/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChangeSetSummaryListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChangeSetSummaryListItemMarshaller {

    private static final MarshallingInfo<String> CHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeSetId").build();
    private static final MarshallingInfo<String> CHANGESETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeSetArn").build();
    private static final MarshallingInfo<String> CHANGESETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeSetName").build();
    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartTime").build();
    private static final MarshallingInfo<String> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndTime").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> ENTITYIDLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityIdList").build();

    private static final ChangeSetSummaryListItemMarshaller instance = new ChangeSetSummaryListItemMarshaller();

    public static ChangeSetSummaryListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChangeSetSummaryListItem changeSetSummaryListItem, ProtocolMarshaller protocolMarshaller) {

        if (changeSetSummaryListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(changeSetSummaryListItem.getChangeSetId(), CHANGESETID_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getChangeSetArn(), CHANGESETARN_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getChangeSetName(), CHANGESETNAME_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(changeSetSummaryListItem.getEntityIdList(), ENTITYIDLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
