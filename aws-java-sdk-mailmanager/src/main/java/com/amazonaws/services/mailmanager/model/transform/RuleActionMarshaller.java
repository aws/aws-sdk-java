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
package com.amazonaws.services.mailmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleActionMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADDHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddHeader").build();
    private static final MarshallingInfo<StructuredPojo> ARCHIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Archive").build();
    private static final MarshallingInfo<StructuredPojo> DELIVERTOMAILBOX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliverToMailbox").build();
    private static final MarshallingInfo<StructuredPojo> DROP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Drop").build();
    private static final MarshallingInfo<StructuredPojo> RELAY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Relay").build();
    private static final MarshallingInfo<StructuredPojo> REPLACERECIPIENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceRecipient").build();
    private static final MarshallingInfo<StructuredPojo> SEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Send").build();
    private static final MarshallingInfo<StructuredPojo> WRITETOS3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteToS3").build();

    private static final RuleActionMarshaller instance = new RuleActionMarshaller();

    public static RuleActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleAction ruleAction, ProtocolMarshaller protocolMarshaller) {

        if (ruleAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleAction.getAddHeader(), ADDHEADER_BINDING);
            protocolMarshaller.marshall(ruleAction.getArchive(), ARCHIVE_BINDING);
            protocolMarshaller.marshall(ruleAction.getDeliverToMailbox(), DELIVERTOMAILBOX_BINDING);
            protocolMarshaller.marshall(ruleAction.getDrop(), DROP_BINDING);
            protocolMarshaller.marshall(ruleAction.getRelay(), RELAY_BINDING);
            protocolMarshaller.marshall(ruleAction.getReplaceRecipient(), REPLACERECIPIENT_BINDING);
            protocolMarshaller.marshall(ruleAction.getSend(), SEND_BINDING);
            protocolMarshaller.marshall(ruleAction.getWriteToS3(), WRITETOS3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
