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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegistrationVersionStatusHistoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegistrationVersionStatusHistoryMarshaller {

    private static final MarshallingInfo<java.util.Date> DRAFTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DraftTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SUBMITTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubmittedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REVIEWINGTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewingTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> APPROVEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DISCARDEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiscardedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DENIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeniedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevokedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ARCHIVEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchivedTimestamp").timestampFormat("unixTimestamp").build();

    private static final RegistrationVersionStatusHistoryMarshaller instance = new RegistrationVersionStatusHistoryMarshaller();

    public static RegistrationVersionStatusHistoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegistrationVersionStatusHistory registrationVersionStatusHistory, ProtocolMarshaller protocolMarshaller) {

        if (registrationVersionStatusHistory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registrationVersionStatusHistory.getDraftTimestamp(), DRAFTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getSubmittedTimestamp(), SUBMITTEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getReviewingTimestamp(), REVIEWINGTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getApprovedTimestamp(), APPROVEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getDiscardedTimestamp(), DISCARDEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getDeniedTimestamp(), DENIEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getRevokedTimestamp(), REVOKEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(registrationVersionStatusHistory.getArchivedTimestamp(), ARCHIVEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
