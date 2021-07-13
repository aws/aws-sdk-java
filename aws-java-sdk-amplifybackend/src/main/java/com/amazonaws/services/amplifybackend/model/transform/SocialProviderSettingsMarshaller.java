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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SocialProviderSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SocialProviderSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> FACEBOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Facebook").build();
    private static final MarshallingInfo<StructuredPojo> GOOGLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Google").build();
    private static final MarshallingInfo<StructuredPojo> LOGINWITHAMAZON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoginWithAmazon").build();
    private static final MarshallingInfo<StructuredPojo> SIGNINWITHAPPLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SignInWithApple").build();

    private static final SocialProviderSettingsMarshaller instance = new SocialProviderSettingsMarshaller();

    public static SocialProviderSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SocialProviderSettings socialProviderSettings, ProtocolMarshaller protocolMarshaller) {

        if (socialProviderSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(socialProviderSettings.getFacebook(), FACEBOOK_BINDING);
            protocolMarshaller.marshall(socialProviderSettings.getGoogle(), GOOGLE_BINDING);
            protocolMarshaller.marshall(socialProviderSettings.getLoginWithAmazon(), LOGINWITHAMAZON_BINDING);
            protocolMarshaller.marshall(socialProviderSettings.getSignInWithApple(), SIGNINWITHAPPLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
