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
package com.amazonaws.services.iamrolesanywhere.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iamrolesanywhere.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubjectSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubjectSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();
    private static final MarshallingInfo<java.util.Date> LASTSEENAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSeenAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SUBJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subjectArn").build();
    private static final MarshallingInfo<String> SUBJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subjectId").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> X509SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("x509Subject").build();

    private static final SubjectSummaryMarshaller instance = new SubjectSummaryMarshaller();

    public static SubjectSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubjectSummary subjectSummary, ProtocolMarshaller protocolMarshaller) {

        if (subjectSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subjectSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(subjectSummary.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(subjectSummary.getLastSeenAt(), LASTSEENAT_BINDING);
            protocolMarshaller.marshall(subjectSummary.getSubjectArn(), SUBJECTARN_BINDING);
            protocolMarshaller.marshall(subjectSummary.getSubjectId(), SUBJECTID_BINDING);
            protocolMarshaller.marshall(subjectSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(subjectSummary.getX509Subject(), X509SUBJECT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
