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
package com.amazonaws.services.chime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SipMediaApplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SipMediaApplicationMarshaller {

    private static final MarshallingInfo<String> SIPMEDIAAPPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SipMediaApplicationId").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();

    private static final SipMediaApplicationMarshaller instance = new SipMediaApplicationMarshaller();

    public static SipMediaApplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SipMediaApplication sipMediaApplication, ProtocolMarshaller protocolMarshaller) {

        if (sipMediaApplication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sipMediaApplication.getSipMediaApplicationId(), SIPMEDIAAPPLICATIONID_BINDING);
            protocolMarshaller.marshall(sipMediaApplication.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(sipMediaApplication.getName(), NAME_BINDING);
            protocolMarshaller.marshall(sipMediaApplication.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(sipMediaApplication.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(sipMediaApplication.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
