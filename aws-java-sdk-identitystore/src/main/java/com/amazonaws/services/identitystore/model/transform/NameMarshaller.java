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
package com.amazonaws.services.identitystore.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.identitystore.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NameMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NameMarshaller {

    private static final MarshallingInfo<String> FORMATTED_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Formatted").build();
    private static final MarshallingInfo<String> FAMILYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FamilyName").build();
    private static final MarshallingInfo<String> GIVENNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GivenName").build();
    private static final MarshallingInfo<String> MIDDLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MiddleName").build();
    private static final MarshallingInfo<String> HONORIFICPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HonorificPrefix").build();
    private static final MarshallingInfo<String> HONORIFICSUFFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HonorificSuffix").build();

    private static final NameMarshaller instance = new NameMarshaller();

    public static NameMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Name name, ProtocolMarshaller protocolMarshaller) {

        if (name == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(name.getFormatted(), FORMATTED_BINDING);
            protocolMarshaller.marshall(name.getFamilyName(), FAMILYNAME_BINDING);
            protocolMarshaller.marshall(name.getGivenName(), GIVENNAME_BINDING);
            protocolMarshaller.marshall(name.getMiddleName(), MIDDLENAME_BINDING);
            protocolMarshaller.marshall(name.getHonorificPrefix(), HONORIFICPREFIX_BINDING);
            protocolMarshaller.marshall(name.getHonorificSuffix(), HONORIFICSUFFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
