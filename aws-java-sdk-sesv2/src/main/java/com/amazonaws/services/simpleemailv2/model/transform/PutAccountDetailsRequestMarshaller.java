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
 * PutAccountDetailsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutAccountDetailsRequestMarshaller {

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
    private static final MarshallingInfo<Boolean> PRODUCTIONACCESSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductionAccessEnabled").build();

    private static final PutAccountDetailsRequestMarshaller instance = new PutAccountDetailsRequestMarshaller();

    public static PutAccountDetailsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutAccountDetailsRequest putAccountDetailsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putAccountDetailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putAccountDetailsRequest.getMailType(), MAILTYPE_BINDING);
            protocolMarshaller.marshall(putAccountDetailsRequest.getWebsiteURL(), WEBSITEURL_BINDING);
            protocolMarshaller.marshall(putAccountDetailsRequest.getContactLanguage(), CONTACTLANGUAGE_BINDING);
            protocolMarshaller.marshall(putAccountDetailsRequest.getUseCaseDescription(), USECASEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(putAccountDetailsRequest.getAdditionalContactEmailAddresses(), ADDITIONALCONTACTEMAILADDRESSES_BINDING);
            protocolMarshaller.marshall(putAccountDetailsRequest.getProductionAccessEnabled(), PRODUCTIONACCESSENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
