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
 * AccountDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountDetailsMarshaller {

    private static final MarshallingInfo<String> MAILTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MailType").build();
    private static final MarshallingInfo<String> WEBSITEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebsiteURL").build();
    private static final MarshallingInfo<String> CONTACTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactLanguage").build();
    private static final MarshallingInfo<String> USECASEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseCaseDescription").build();
    private static final MarshallingInfo<List> ADDITIONALCONTACTEMAILADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalContactEmailAddresses").build();
    private static final MarshallingInfo<StructuredPojo> REVIEWDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewDetails").build();

    private static final AccountDetailsMarshaller instance = new AccountDetailsMarshaller();

    public static AccountDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountDetails accountDetails, ProtocolMarshaller protocolMarshaller) {

        if (accountDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountDetails.getMailType(), MAILTYPE_BINDING);
            protocolMarshaller.marshall(accountDetails.getWebsiteURL(), WEBSITEURL_BINDING);
            protocolMarshaller.marshall(accountDetails.getContactLanguage(), CONTACTLANGUAGE_BINDING);
            protocolMarshaller.marshall(accountDetails.getUseCaseDescription(), USECASEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(accountDetails.getAdditionalContactEmailAddresses(), ADDITIONALCONTACTEMAILADDRESSES_BINDING);
            protocolMarshaller.marshall(accountDetails.getReviewDetails(), REVIEWDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
