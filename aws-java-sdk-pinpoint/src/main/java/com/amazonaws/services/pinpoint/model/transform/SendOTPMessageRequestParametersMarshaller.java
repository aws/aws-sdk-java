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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendOTPMessageRequestParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendOTPMessageRequestParametersMarshaller {

    private static final MarshallingInfo<Integer> ALLOWEDATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedAttempts").build();
    private static final MarshallingInfo<String> BRANDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BrandName").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channel").build();
    private static final MarshallingInfo<Integer> CODELENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeLength").build();
    private static final MarshallingInfo<String> DESTINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIdentity").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityId").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Language").build();
    private static final MarshallingInfo<String> ORIGINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentity").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceId").build();
    private static final MarshallingInfo<String> TEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateId").build();
    private static final MarshallingInfo<Integer> VALIDITYPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidityPeriod").build();

    private static final SendOTPMessageRequestParametersMarshaller instance = new SendOTPMessageRequestParametersMarshaller();

    public static SendOTPMessageRequestParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendOTPMessageRequestParameters sendOTPMessageRequestParameters, ProtocolMarshaller protocolMarshaller) {

        if (sendOTPMessageRequestParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getAllowedAttempts(), ALLOWEDATTEMPTS_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getBrandName(), BRANDNAME_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getCodeLength(), CODELENGTH_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getDestinationIdentity(), DESTINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getLanguage(), LANGUAGE_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getOriginationIdentity(), ORIGINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getTemplateId(), TEMPLATEID_BINDING);
            protocolMarshaller.marshall(sendOTPMessageRequestParameters.getValidityPeriod(), VALIDITYPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
