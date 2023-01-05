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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleSummaryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> RULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleId").build();
    private static final MarshallingInfo<String> RULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleArn").build();
    private static final MarshallingInfo<String> EVENTSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceName").build();
    private static final MarshallingInfo<String> PUBLISHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishStatus").build();
    private static final MarshallingInfo<List> ACTIONSUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionSummaries").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").timestampFormat("unixTimestamp").build();

    private static final RuleSummaryMarshaller instance = new RuleSummaryMarshaller();

    public static RuleSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleSummary ruleSummary, ProtocolMarshaller protocolMarshaller) {

        if (ruleSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(ruleSummary.getRuleId(), RULEID_BINDING);
            protocolMarshaller.marshall(ruleSummary.getRuleArn(), RULEARN_BINDING);
            protocolMarshaller.marshall(ruleSummary.getEventSourceName(), EVENTSOURCENAME_BINDING);
            protocolMarshaller.marshall(ruleSummary.getPublishStatus(), PUBLISHSTATUS_BINDING);
            protocolMarshaller.marshall(ruleSummary.getActionSummaries(), ACTIONSUMMARIES_BINDING);
            protocolMarshaller.marshall(ruleSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(ruleSummary.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
