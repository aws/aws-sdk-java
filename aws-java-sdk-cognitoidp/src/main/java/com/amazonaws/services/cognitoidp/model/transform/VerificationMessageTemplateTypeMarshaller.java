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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VerificationMessageTemplateTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerificationMessageTemplateTypeMarshaller {

    private static final MarshallingInfo<String> SMSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsMessage").build();
    private static final MarshallingInfo<String> EMAILMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailMessage").build();
    private static final MarshallingInfo<String> EMAILSUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailSubject").build();
    private static final MarshallingInfo<String> EMAILMESSAGEBYLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailMessageByLink").build();
    private static final MarshallingInfo<String> EMAILSUBJECTBYLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailSubjectByLink").build();
    private static final MarshallingInfo<String> DEFAULTEMAILOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultEmailOption").build();

    private static final VerificationMessageTemplateTypeMarshaller instance = new VerificationMessageTemplateTypeMarshaller();

    public static VerificationMessageTemplateTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerificationMessageTemplateType verificationMessageTemplateType, ProtocolMarshaller protocolMarshaller) {

        if (verificationMessageTemplateType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verificationMessageTemplateType.getSmsMessage(), SMSMESSAGE_BINDING);
            protocolMarshaller.marshall(verificationMessageTemplateType.getEmailMessage(), EMAILMESSAGE_BINDING);
            protocolMarshaller.marshall(verificationMessageTemplateType.getEmailSubject(), EMAILSUBJECT_BINDING);
            protocolMarshaller.marshall(verificationMessageTemplateType.getEmailMessageByLink(), EMAILMESSAGEBYLINK_BINDING);
            protocolMarshaller.marshall(verificationMessageTemplateType.getEmailSubjectByLink(), EMAILSUBJECTBYLINK_BINDING);
            protocolMarshaller.marshall(verificationMessageTemplateType.getDefaultEmailOption(), DEFAULTEMAILOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
