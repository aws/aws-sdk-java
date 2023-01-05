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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClaimedPhoneNumberSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClaimedPhoneNumberSummaryMarshaller {

    private static final MarshallingInfo<String> PHONENUMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberId").build();
    private static final MarshallingInfo<String> PHONENUMBERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberArn").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<String> PHONENUMBERCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberCountryCode").build();
    private static final MarshallingInfo<String> PHONENUMBERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberType").build();
    private static final MarshallingInfo<String> PHONENUMBERDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberDescription").build();
    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> PHONENUMBERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberStatus").build();

    private static final ClaimedPhoneNumberSummaryMarshaller instance = new ClaimedPhoneNumberSummaryMarshaller();

    public static ClaimedPhoneNumberSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClaimedPhoneNumberSummary claimedPhoneNumberSummary, ProtocolMarshaller protocolMarshaller) {

        if (claimedPhoneNumberSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberId(), PHONENUMBERID_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberArn(), PHONENUMBERARN_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberCountryCode(), PHONENUMBERCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberType(), PHONENUMBERTYPE_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberDescription(), PHONENUMBERDESCRIPTION_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(claimedPhoneNumberSummary.getPhoneNumberStatus(), PHONENUMBERSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
