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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OriginationIdentityMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OriginationIdentityMetadataMarshaller {

    private static final MarshallingInfo<String> ORIGINATIONIDENTITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentityArn").build();
    private static final MarshallingInfo<String> ORIGINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentity").build();
    private static final MarshallingInfo<String> ISOCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsoCountryCode").build();
    private static final MarshallingInfo<List> NUMBERCAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberCapabilities").build();

    private static final OriginationIdentityMetadataMarshaller instance = new OriginationIdentityMetadataMarshaller();

    public static OriginationIdentityMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OriginationIdentityMetadata originationIdentityMetadata, ProtocolMarshaller protocolMarshaller) {

        if (originationIdentityMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(originationIdentityMetadata.getOriginationIdentityArn(), ORIGINATIONIDENTITYARN_BINDING);
            protocolMarshaller.marshall(originationIdentityMetadata.getOriginationIdentity(), ORIGINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(originationIdentityMetadata.getIsoCountryCode(), ISOCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(originationIdentityMetadata.getNumberCapabilities(), NUMBERCAPABILITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
