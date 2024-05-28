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
package com.amazonaws.services.cleanrooms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SchemaSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SchemaSummaryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> CREATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorAccountId").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> COLLABORATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationArn").build();
    private static final MarshallingInfo<List> ANALYSISRULETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisRuleTypes").build();
    private static final MarshallingInfo<String> ANALYSISMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisMethod").build();

    private static final SchemaSummaryMarshaller instance = new SchemaSummaryMarshaller();

    public static SchemaSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SchemaSummary schemaSummary, ProtocolMarshaller protocolMarshaller) {

        if (schemaSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schemaSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(schemaSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(schemaSummary.getCreatorAccountId(), CREATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(schemaSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(schemaSummary.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(schemaSummary.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(schemaSummary.getCollaborationArn(), COLLABORATIONARN_BINDING);
            protocolMarshaller.marshall(schemaSummary.getAnalysisRuleTypes(), ANALYSISRULETYPES_BINDING);
            protocolMarshaller.marshall(schemaSummary.getAnalysisMethod(), ANALYSISMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
