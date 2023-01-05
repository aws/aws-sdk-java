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
 * IosImportClientBrandingAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IosImportClientBrandingAttributesMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> LOGO_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Logo").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> LOGO2X_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Logo2x").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> LOGO3X_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Logo3x").build();
    private static final MarshallingInfo<String> SUPPORTEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportEmail").build();
    private static final MarshallingInfo<String> SUPPORTLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportLink").build();
    private static final MarshallingInfo<String> FORGOTPASSWORDLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForgotPasswordLink").build();
    private static final MarshallingInfo<Map> LOGINMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LoginMessage").build();

    private static final IosImportClientBrandingAttributesMarshaller instance = new IosImportClientBrandingAttributesMarshaller();

    public static IosImportClientBrandingAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IosImportClientBrandingAttributes iosImportClientBrandingAttributes, ProtocolMarshaller protocolMarshaller) {

        if (iosImportClientBrandingAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getLogo(), LOGO_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getLogo2x(), LOGO2X_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getLogo3x(), LOGO3X_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getSupportEmail(), SUPPORTEMAIL_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getSupportLink(), SUPPORTLINK_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getForgotPasswordLink(), FORGOTPASSWORDLINK_BINDING);
            protocolMarshaller.marshall(iosImportClientBrandingAttributes.getLoginMessage(), LOGINMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
