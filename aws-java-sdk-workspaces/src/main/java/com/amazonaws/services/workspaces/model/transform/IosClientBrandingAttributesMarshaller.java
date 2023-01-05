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
package com.amazonaws.services.workspaces.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IosClientBrandingAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IosClientBrandingAttributesMarshaller {

    private static final MarshallingInfo<String> LOGOURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogoUrl").build();
    private static final MarshallingInfo<String> LOGO2XURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Logo2xUrl").build();
    private static final MarshallingInfo<String> LOGO3XURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Logo3xUrl").build();
    private static final MarshallingInfo<String> SUPPORTEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportEmail").build();
    private static final MarshallingInfo<String> SUPPORTLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportLink").build();
    private static final MarshallingInfo<String> FORGOTPASSWORDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForgotPasswordLink").build();
    private static final MarshallingInfo<Map> LOGINMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LoginMessage").build();

    private static final IosClientBrandingAttributesMarshaller instance = new IosClientBrandingAttributesMarshaller();

    public static IosClientBrandingAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IosClientBrandingAttributes iosClientBrandingAttributes, ProtocolMarshaller protocolMarshaller) {

        if (iosClientBrandingAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iosClientBrandingAttributes.getLogoUrl(), LOGOURL_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getLogo2xUrl(), LOGO2XURL_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getLogo3xUrl(), LOGO3XURL_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getSupportEmail(), SUPPORTEMAIL_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getSupportLink(), SUPPORTLINK_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getForgotPasswordLink(), FORGOTPASSWORDLINK_BINDING);
            protocolMarshaller.marshall(iosClientBrandingAttributes.getLoginMessage(), LOGINMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
