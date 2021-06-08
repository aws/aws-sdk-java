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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendBulkEmailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendBulkEmailRequestMarshaller {

    private static final MarshallingInfo<String> FROMEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromEmailAddress").build();
    private static final MarshallingInfo<String> FROMEMAILADDRESSIDENTITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromEmailAddressIdentityArn").build();
    private static final MarshallingInfo<List> REPLYTOADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplyToAddresses").build();
    private static final MarshallingInfo<String> FEEDBACKFORWARDINGEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeedbackForwardingEmailAddress").build();
    private static final MarshallingInfo<String> FEEDBACKFORWARDINGEMAILADDRESSIDENTITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeedbackForwardingEmailAddressIdentityArn").build();
    private static final MarshallingInfo<List> DEFAULTEMAILTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultEmailTags").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultContent").build();
    private static final MarshallingInfo<List> BULKEMAILENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BulkEmailEntries").build();
    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();

    private static final SendBulkEmailRequestMarshaller instance = new SendBulkEmailRequestMarshaller();

    public static SendBulkEmailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendBulkEmailRequest sendBulkEmailRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendBulkEmailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendBulkEmailRequest.getFromEmailAddress(), FROMEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getFromEmailAddressIdentityArn(), FROMEMAILADDRESSIDENTITYARN_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getReplyToAddresses(), REPLYTOADDRESSES_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getFeedbackForwardingEmailAddress(), FEEDBACKFORWARDINGEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getFeedbackForwardingEmailAddressIdentityArn(), FEEDBACKFORWARDINGEMAILADDRESSIDENTITYARN_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getDefaultEmailTags(), DEFAULTEMAILTAGS_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getDefaultContent(), DEFAULTCONTENT_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getBulkEmailEntries(), BULKEMAILENTRIES_BINDING);
            protocolMarshaller.marshall(sendBulkEmailRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
