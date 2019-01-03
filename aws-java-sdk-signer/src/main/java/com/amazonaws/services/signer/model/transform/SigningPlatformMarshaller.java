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
package com.amazonaws.services.signer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.signer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SigningPlatformMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SigningPlatformMarshaller {

    private static final MarshallingInfo<String> PLATFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformId").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> PARTNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("partner").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("target").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("category").build();
    private static final MarshallingInfo<StructuredPojo> SIGNINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SIGNINGIMAGEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signingImageFormat").build();
    private static final MarshallingInfo<Integer> MAXSIZEINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxSizeInMB").build();

    private static final SigningPlatformMarshaller instance = new SigningPlatformMarshaller();

    public static SigningPlatformMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SigningPlatform signingPlatform, ProtocolMarshaller protocolMarshaller) {

        if (signingPlatform == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(signingPlatform.getPlatformId(), PLATFORMID_BINDING);
            protocolMarshaller.marshall(signingPlatform.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(signingPlatform.getPartner(), PARTNER_BINDING);
            protocolMarshaller.marshall(signingPlatform.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(signingPlatform.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(signingPlatform.getSigningConfiguration(), SIGNINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(signingPlatform.getSigningImageFormat(), SIGNINGIMAGEFORMAT_BINDING);
            protocolMarshaller.marshall(signingPlatform.getMaxSizeInMB(), MAXSIZEINMB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
