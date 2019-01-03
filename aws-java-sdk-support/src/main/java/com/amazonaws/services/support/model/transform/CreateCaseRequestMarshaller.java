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
 * CreateCaseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCaseRequestMarshaller {

    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subject").build();
    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceCode").build();
    private static final MarshallingInfo<String> SEVERITYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severityCode").build();
    private static final MarshallingInfo<String> CATEGORYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categoryCode").build();
    private static final MarshallingInfo<String> COMMUNICATIONBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("communicationBody").build();
    private static final MarshallingInfo<List> CCEMAILADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ccEmailAddresses").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("language").build();
    private static final MarshallingInfo<String> ISSUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issueType").build();
    private static final MarshallingInfo<String> ATTACHMENTSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachmentSetId").build();

    private static final CreateCaseRequestMarshaller instance = new CreateCaseRequestMarshaller();

    public static CreateCaseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCaseRequest createCaseRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCaseRequest.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getSeverityCode(), SEVERITYCODE_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getCategoryCode(), CATEGORYCODE_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getCommunicationBody(), COMMUNICATIONBODY_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getCcEmailAddresses(), CCEMAILADDRESSES_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getLanguage(), LANGUAGE_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getIssueType(), ISSUETYPE_BINDING);
            protocolMarshaller.marshall(createCaseRequest.getAttachmentSetId(), ATTACHMENTSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
