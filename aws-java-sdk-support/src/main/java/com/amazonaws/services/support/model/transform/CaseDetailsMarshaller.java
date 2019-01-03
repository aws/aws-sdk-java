/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CaseDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaseDetailsMarshaller {

    private static final MarshallingInfo<String> CASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("caseId").build();
    private static final MarshallingInfo<String> DISPLAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("displayId").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subject").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceCode").build();
    private static final MarshallingInfo<String> CATEGORYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categoryCode").build();
    private static final MarshallingInfo<String> SEVERITYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severityCode").build();
    private static final MarshallingInfo<String> SUBMITTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("submittedBy").build();
    private static final MarshallingInfo<String> TIMECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeCreated").build();
    private static final MarshallingInfo<StructuredPojo> RECENTCOMMUNICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recentCommunications").build();
    private static final MarshallingInfo<List> CCEMAILADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ccEmailAddresses").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("language").build();

    private static final CaseDetailsMarshaller instance = new CaseDetailsMarshaller();

    public static CaseDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaseDetails caseDetails, ProtocolMarshaller protocolMarshaller) {

        if (caseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(caseDetails.getCaseId(), CASEID_BINDING);
            protocolMarshaller.marshall(caseDetails.getDisplayId(), DISPLAYID_BINDING);
            protocolMarshaller.marshall(caseDetails.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(caseDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(caseDetails.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(caseDetails.getCategoryCode(), CATEGORYCODE_BINDING);
            protocolMarshaller.marshall(caseDetails.getSeverityCode(), SEVERITYCODE_BINDING);
            protocolMarshaller.marshall(caseDetails.getSubmittedBy(), SUBMITTEDBY_BINDING);
            protocolMarshaller.marshall(caseDetails.getTimeCreated(), TIMECREATED_BINDING);
            protocolMarshaller.marshall(caseDetails.getRecentCommunications(), RECENTCOMMUNICATIONS_BINDING);
            protocolMarshaller.marshall(caseDetails.getCcEmailAddresses(), CCEMAILADDRESSES_BINDING);
            protocolMarshaller.marshall(caseDetails.getLanguage(), LANGUAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
