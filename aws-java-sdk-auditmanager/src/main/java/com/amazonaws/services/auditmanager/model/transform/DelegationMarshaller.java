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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DelegationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DelegationMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ASSESSMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentName").build();
    private static final MarshallingInfo<String> ASSESSMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> ROLETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONTROLSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlSetId").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();

    private static final DelegationMarshaller instance = new DelegationMarshaller();

    public static DelegationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Delegation delegation, ProtocolMarshaller protocolMarshaller) {

        if (delegation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(delegation.getId(), ID_BINDING);
            protocolMarshaller.marshall(delegation.getAssessmentName(), ASSESSMENTNAME_BINDING);
            protocolMarshaller.marshall(delegation.getAssessmentId(), ASSESSMENTID_BINDING);
            protocolMarshaller.marshall(delegation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(delegation.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(delegation.getRoleType(), ROLETYPE_BINDING);
            protocolMarshaller.marshall(delegation.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(delegation.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(delegation.getControlSetId(), CONTROLSETID_BINDING);
            protocolMarshaller.marshall(delegation.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(delegation.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
