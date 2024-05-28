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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollaborationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollaborationMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> CREATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorAccountId").build();
    private static final MarshallingInfo<String> CREATORDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorDisplayName").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MEMBERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memberStatus").build();
    private static final MarshallingInfo<String> MEMBERSHIPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipId").build();
    private static final MarshallingInfo<String> MEMBERSHIPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipArn").build();
    private static final MarshallingInfo<StructuredPojo> DATAENCRYPTIONMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataEncryptionMetadata").build();
    private static final MarshallingInfo<String> QUERYLOGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryLogStatus").build();

    private static final CollaborationMarshaller instance = new CollaborationMarshaller();

    public static CollaborationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Collaboration collaboration, ProtocolMarshaller protocolMarshaller) {

        if (collaboration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collaboration.getId(), ID_BINDING);
            protocolMarshaller.marshall(collaboration.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(collaboration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(collaboration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(collaboration.getCreatorAccountId(), CREATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(collaboration.getCreatorDisplayName(), CREATORDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(collaboration.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(collaboration.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(collaboration.getMemberStatus(), MEMBERSTATUS_BINDING);
            protocolMarshaller.marshall(collaboration.getMembershipId(), MEMBERSHIPID_BINDING);
            protocolMarshaller.marshall(collaboration.getMembershipArn(), MEMBERSHIPARN_BINDING);
            protocolMarshaller.marshall(collaboration.getDataEncryptionMetadata(), DATAENCRYPTIONMETADATA_BINDING);
            protocolMarshaller.marshall(collaboration.getQueryLogStatus(), QUERYLOGSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
