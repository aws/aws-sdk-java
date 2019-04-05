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
 * AddCommunicationToCaseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddCommunicationToCaseRequestMarshaller {

    private static final MarshallingInfo<String> CASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("caseId").build();
    private static final MarshallingInfo<String> COMMUNICATIONBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("communicationBody").build();
    private static final MarshallingInfo<List> CCEMAILADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ccEmailAddresses").build();
    private static final MarshallingInfo<String> ATTACHMENTSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachmentSetId").build();

    private static final AddCommunicationToCaseRequestMarshaller instance = new AddCommunicationToCaseRequestMarshaller();

    public static AddCommunicationToCaseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddCommunicationToCaseRequest addCommunicationToCaseRequest, ProtocolMarshaller protocolMarshaller) {

        if (addCommunicationToCaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addCommunicationToCaseRequest.getCaseId(), CASEID_BINDING);
            protocolMarshaller.marshall(addCommunicationToCaseRequest.getCommunicationBody(), COMMUNICATIONBODY_BINDING);
            protocolMarshaller.marshall(addCommunicationToCaseRequest.getCcEmailAddresses(), CCEMAILADDRESSES_BINDING);
            protocolMarshaller.marshall(addCommunicationToCaseRequest.getAttachmentSetId(), ATTACHMENTSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
