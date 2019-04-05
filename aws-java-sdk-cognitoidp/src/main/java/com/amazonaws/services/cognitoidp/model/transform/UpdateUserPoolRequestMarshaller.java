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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserPoolRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserPoolRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<StructuredPojo> POLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Policies").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaConfig").build();
    private static final MarshallingInfo<List> AUTOVERIFIEDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoVerifiedAttributes").build();
    private static final MarshallingInfo<String> SMSVERIFICATIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsVerificationMessage").build();
    private static final MarshallingInfo<String> EMAILVERIFICATIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailVerificationMessage").build();
    private static final MarshallingInfo<String> EMAILVERIFICATIONSUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailVerificationSubject").build();
    private static final MarshallingInfo<StructuredPojo> VERIFICATIONMESSAGETEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationMessageTemplate").build();
    private static final MarshallingInfo<String> SMSAUTHENTICATIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsAuthenticationMessage").build();
    private static final MarshallingInfo<String> MFACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MfaConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEVICECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> EMAILCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SMSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsConfiguration").build();
    private static final MarshallingInfo<Map> USERPOOLTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserPoolTags").build();
    private static final MarshallingInfo<StructuredPojo> ADMINCREATEUSERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdminCreateUserConfig").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLADDONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolAddOns").build();

    private static final UpdateUserPoolRequestMarshaller instance = new UpdateUserPoolRequestMarshaller();

    public static UpdateUserPoolRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserPoolRequest updateUserPoolRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserPoolRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getPolicies(), POLICIES_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getLambdaConfig(), LAMBDACONFIG_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getAutoVerifiedAttributes(), AUTOVERIFIEDATTRIBUTES_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getSmsVerificationMessage(), SMSVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getEmailVerificationMessage(), EMAILVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getEmailVerificationSubject(), EMAILVERIFICATIONSUBJECT_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getVerificationMessageTemplate(), VERIFICATIONMESSAGETEMPLATE_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getSmsAuthenticationMessage(), SMSAUTHENTICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getMfaConfiguration(), MFACONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getDeviceConfiguration(), DEVICECONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getEmailConfiguration(), EMAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getSmsConfiguration(), SMSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getUserPoolTags(), USERPOOLTAGS_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getAdminCreateUserConfig(), ADMINCREATEUSERCONFIG_BINDING);
            protocolMarshaller.marshall(updateUserPoolRequest.getUserPoolAddOns(), USERPOOLADDONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
