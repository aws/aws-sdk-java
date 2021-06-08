/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.shield.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProtectionGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtectionGroupMarshaller {

    private static final MarshallingInfo<String> PROTECTIONGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectionGroupId").build();
    private static final MarshallingInfo<String> AGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Aggregation").build();
    private static final MarshallingInfo<String> PATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pattern").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<List> MEMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Members").build();
    private static final MarshallingInfo<String> PROTECTIONGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectionGroupArn").build();

    private static final ProtectionGroupMarshaller instance = new ProtectionGroupMarshaller();

    public static ProtectionGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtectionGroup protectionGroup, ProtocolMarshaller protocolMarshaller) {

        if (protectionGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protectionGroup.getProtectionGroupId(), PROTECTIONGROUPID_BINDING);
            protocolMarshaller.marshall(protectionGroup.getAggregation(), AGGREGATION_BINDING);
            protocolMarshaller.marshall(protectionGroup.getPattern(), PATTERN_BINDING);
            protocolMarshaller.marshall(protectionGroup.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(protectionGroup.getMembers(), MEMBERS_BINDING);
            protocolMarshaller.marshall(protectionGroup.getProtectionGroupArn(), PROTECTIONGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
