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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAAUTHORIZERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaAuthorizerConfig").build();
    private static final MarshallingInfo<StructuredPojo> OPENIDCONNECTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenIdConnectConfig").build();
    private static final MarshallingInfo<StructuredPojo> USERPOOLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolConfig").build();

    private static final AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller instance = new AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller();

    public static AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails.getLambdaAuthorizerConfig(),
                    LAMBDAAUTHORIZERCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails.getOpenIdConnectConfig(), OPENIDCONNECTCONFIG_BINDING);
            protocolMarshaller.marshall(awsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails.getUserPoolConfig(), USERPOOLCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
