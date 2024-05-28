/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAppSyncGraphQlApiDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAppSyncGraphQlApiDetailsMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<StructuredPojo> OPENIDCONNECTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenIdConnectConfig").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaAuthorizerConfig").build();
    private static final MarshallingInfo<Boolean> XRAYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XrayEnabled").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolConfig").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogConfig").build();
    private static final MarshallingInfo<List> ADDITIONALAUTHENTICATIONPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalAuthenticationProviders").build();
    private static final MarshallingInfo<String> WAFWEBACLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WafWebAclArn").build();

    private static final AwsAppSyncGraphQlApiDetailsMarshaller instance = new AwsAppSyncGraphQlApiDetailsMarshaller();

    public static AwsAppSyncGraphQlApiDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAppSyncGraphQlApiDetails awsAppSyncGraphQlApiDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAppSyncGraphQlApiDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getOpenIdConnectConfig(), OPENIDCONNECTCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getLambdaAuthorizerConfig(), LAMBDAAUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getXrayEnabled(), XRAYENABLED_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getUserPoolConfig(), USERPOOLCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getLogConfig(), LOGCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getAdditionalAuthenticationProviders(), ADDITIONALAUTHENTICATIONPROVIDERS_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiDetails.getWafWebAclArn(), WAFWEBACLARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
