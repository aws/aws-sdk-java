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
 * NotifyConfigurationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotifyConfigurationTypeMarshaller {

    private static final MarshallingInfo<String> FROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("From").build();
    private static final MarshallingInfo<String> REPLYTO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReplyTo").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<StructuredPojo> BLOCKEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockEmail").build();
    private static final MarshallingInfo<StructuredPojo> NOACTIONEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoActionEmail").build();
    private static final MarshallingInfo<StructuredPojo> MFAEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MfaEmail").build();

    private static final NotifyConfigurationTypeMarshaller instance = new NotifyConfigurationTypeMarshaller();

    public static NotifyConfigurationTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotifyConfigurationType notifyConfigurationType, ProtocolMarshaller protocolMarshaller) {

        if (notifyConfigurationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notifyConfigurationType.getFrom(), FROM_BINDING);
            protocolMarshaller.marshall(notifyConfigurationType.getReplyTo(), REPLYTO_BINDING);
            protocolMarshaller.marshall(notifyConfigurationType.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(notifyConfigurationType.getBlockEmail(), BLOCKEMAIL_BINDING);
            protocolMarshaller.marshall(notifyConfigurationType.getNoActionEmail(), NOACTIONEMAIL_BINDING);
            protocolMarshaller.marshall(notifyConfigurationType.getMfaEmail(), MFAEMAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
