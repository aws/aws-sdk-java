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
 * UserPoolTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserPoolTypeMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> POLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Policies").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaConfig").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> SCHEMAATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaAttributes").build();
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
    private static final MarshallingInfo<Integer> ESTIMATEDNUMBEROFUSERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedNumberOfUsers").build();
    private static final MarshallingInfo<StructuredPojo> EMAILCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SMSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsConfiguration").build();
    private static final MarshallingInfo<Map> USERPOOLTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserPoolTags").build();
    private static final MarshallingInfo<String> SMSCONFIGURATIONFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmsConfigurationFailure").build();
    private static final MarshallingInfo<String> EMAILCONFIGURATIONFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailConfigurationFailure").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> CUSTOMDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomDomain").build();
    private static final MarshallingInfo<StructuredPojo> ADMINCREATEUSERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdminCreateUserConfig").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLADDONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolAddOns").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();

    private static final UserPoolTypeMarshaller instance = new UserPoolTypeMarshaller();

    public static UserPoolTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserPoolType userPoolType, ProtocolMarshaller protocolMarshaller) {

        if (userPoolType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userPoolType.getId(), ID_BINDING);
            protocolMarshaller.marshall(userPoolType.getName(), NAME_BINDING);
            protocolMarshaller.marshall(userPoolType.getPolicies(), POLICIES_BINDING);
            protocolMarshaller.marshall(userPoolType.getLambdaConfig(), LAMBDACONFIG_BINDING);
            protocolMarshaller.marshall(userPoolType.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(userPoolType.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(userPoolType.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(userPoolType.getSchemaAttributes(), SCHEMAATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolType.getAutoVerifiedAttributes(), AUTOVERIFIEDATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolType.getAliasAttributes(), ALIASATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolType.getUsernameAttributes(), USERNAMEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolType.getSmsVerificationMessage(), SMSVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(userPoolType.getEmailVerificationMessage(), EMAILVERIFICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(userPoolType.getEmailVerificationSubject(), EMAILVERIFICATIONSUBJECT_BINDING);
            protocolMarshaller.marshall(userPoolType.getVerificationMessageTemplate(), VERIFICATIONMESSAGETEMPLATE_BINDING);
            protocolMarshaller.marshall(userPoolType.getSmsAuthenticationMessage(), SMSAUTHENTICATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(userPoolType.getMfaConfiguration(), MFACONFIGURATION_BINDING);
            protocolMarshaller.marshall(userPoolType.getDeviceConfiguration(), DEVICECONFIGURATION_BINDING);
            protocolMarshaller.marshall(userPoolType.getEstimatedNumberOfUsers(), ESTIMATEDNUMBEROFUSERS_BINDING);
            protocolMarshaller.marshall(userPoolType.getEmailConfiguration(), EMAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(userPoolType.getSmsConfiguration(), SMSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(userPoolType.getUserPoolTags(), USERPOOLTAGS_BINDING);
            protocolMarshaller.marshall(userPoolType.getSmsConfigurationFailure(), SMSCONFIGURATIONFAILURE_BINDING);
            protocolMarshaller.marshall(userPoolType.getEmailConfigurationFailure(), EMAILCONFIGURATIONFAILURE_BINDING);
            protocolMarshaller.marshall(userPoolType.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(userPoolType.getCustomDomain(), CUSTOMDOMAIN_BINDING);
            protocolMarshaller.marshall(userPoolType.getAdminCreateUserConfig(), ADMINCREATEUSERCONFIG_BINDING);
            protocolMarshaller.marshall(userPoolType.getUserPoolAddOns(), USERPOOLADDONS_BINDING);
            protocolMarshaller.marshall(userPoolType.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
