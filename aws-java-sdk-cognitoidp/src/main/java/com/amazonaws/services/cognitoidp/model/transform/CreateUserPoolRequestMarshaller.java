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
 * CreateUserPoolRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUserPoolRequestMarshaller {

    private static final MarshallingInfo<String> POOLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolName").build();
    private static final MarshallingInfo<StructuredPojo> POLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Policies").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaConfig").build();
    private static final MarshallingInfo<List> AUTOVERIFIEDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoVerifiedAttributes").build();
    private static final MarshallingInfo<List> ALIASATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AliasAttributes").build();
    private static final MarshallingInfo<List> USERNAMEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsernameAttributes").build();
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
    private static final MarshallingInfo<List> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Schema").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLADDONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolAddOns").build();

    private static final CreateUserPoolRequestMarshaller instance = new CreateUserPoolRequestMarshaller();

    public static CreateUserPoolRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUserPoolRequest createUserPoolRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUserPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUserPoolRequest.getPoolName(), POOLNAME_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getPolicies(), POLICIES_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getLambdaConfig(), LAMBDACONFIG_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getAutoVerifiedAttributes(), AUTOVERIFIEDATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getAliasAttributes(), ALIASATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getUsernameAttributes(), USERNAMEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getSmsVerificationMessage(), SMSVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getEmailVerificationMessage(), EMAILVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getEmailVerificationSubject(), EMAILVERIFICATIONSUBJECT_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getVerificationMessageTemplate(), VERIFICATIONMESSAGETEMPLATE_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getSmsAuthenticationMessage(), SMSAUTHENTICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getMfaConfiguration(), MFACONFIGURATION_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getDeviceConfiguration(), DEVICECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getEmailConfiguration(), EMAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getSmsConfiguration(), SMSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getUserPoolTags(), USERPOOLTAGS_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getAdminCreateUserConfig(), ADMINCREATEUSERCONFIG_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(createUserPoolRequest.getUserPoolAddOns(), USERPOOLADDONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
