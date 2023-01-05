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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchAvailablePhoneNumbersRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchAvailablePhoneNumbersRequestMarshaller {

    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetArn").build();
    private static final MarshallingInfo<String> PHONENUMBERCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberCountryCode").build();
    private static final MarshallingInfo<String> PHONENUMBERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberType").build();
    private static final MarshallingInfo<String> PHONENUMBERPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberPrefix").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final SearchAvailablePhoneNumbersRequestMarshaller instance = new SearchAvailablePhoneNumbersRequestMarshaller();

    public static SearchAvailablePhoneNumbersRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchAvailablePhoneNumbersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getPhoneNumberCountryCode(), PHONENUMBERCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getPhoneNumberType(), PHONENUMBERTYPE_BINDING);
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getPhoneNumberPrefix(), PHONENUMBERPREFIX_BINDING);
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(searchAvailablePhoneNumbersRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
