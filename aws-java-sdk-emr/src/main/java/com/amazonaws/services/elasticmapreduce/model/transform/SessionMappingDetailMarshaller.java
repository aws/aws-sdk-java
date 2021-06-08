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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionMappingDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionMappingDetailMarshaller {

    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StudioId").build();
    private static final MarshallingInfo<String> IDENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityId").build();
    private static final MarshallingInfo<String> IDENTITYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityName").build();
    private static final MarshallingInfo<String> IDENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityType").build();
    private static final MarshallingInfo<String> SESSIONPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionPolicyArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final SessionMappingDetailMarshaller instance = new SessionMappingDetailMarshaller();

    public static SessionMappingDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionMappingDetail sessionMappingDetail, ProtocolMarshaller protocolMarshaller) {

        if (sessionMappingDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionMappingDetail.getStudioId(), STUDIOID_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getIdentityId(), IDENTITYID_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getIdentityName(), IDENTITYNAME_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getIdentityType(), IDENTITYTYPE_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getSessionPolicyArn(), SESSIONPOLICYARN_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(sessionMappingDetail.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
