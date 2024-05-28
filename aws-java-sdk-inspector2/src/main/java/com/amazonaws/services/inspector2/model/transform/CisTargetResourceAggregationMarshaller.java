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
package com.amazonaws.services.inspector2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CisTargetResourceAggregationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CisTargetResourceAggregationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> SCANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanArn").build();
    private static final MarshallingInfo<StructuredPojo> STATUSCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusCounts").build();
    private static final MarshallingInfo<String> TARGETRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceId").build();
    private static final MarshallingInfo<Map> TARGETRESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceTags").build();
    private static final MarshallingInfo<String> TARGETSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetStatus").build();
    private static final MarshallingInfo<String> TARGETSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetStatusReason").build();

    private static final CisTargetResourceAggregationMarshaller instance = new CisTargetResourceAggregationMarshaller();

    public static CisTargetResourceAggregationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CisTargetResourceAggregation cisTargetResourceAggregation, ProtocolMarshaller protocolMarshaller) {

        if (cisTargetResourceAggregation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cisTargetResourceAggregation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getScanArn(), SCANARN_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getStatusCounts(), STATUSCOUNTS_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getTargetResourceId(), TARGETRESOURCEID_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getTargetResourceTags(), TARGETRESOURCETAGS_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getTargetStatus(), TARGETSTATUS_BINDING);
            protocolMarshaller.marshall(cisTargetResourceAggregation.getTargetStatusReason(), TARGETSTATUSREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
