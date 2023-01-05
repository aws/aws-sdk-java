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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceMetadataOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceMetadataOptionsMarshaller {

    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> HTTPTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpTokens").build();
    private static final MarshallingInfo<String> HTTPENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpEndpoint").build();
    private static final MarshallingInfo<Integer> HTTPPUTRESPONSEHOPLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpPutResponseHopLimit").build();
    private static final MarshallingInfo<String> HTTPPROTOCOLIPV6_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpProtocolIpv6").build();

    private static final InstanceMetadataOptionsMarshaller instance = new InstanceMetadataOptionsMarshaller();

    public static InstanceMetadataOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceMetadataOptions instanceMetadataOptions, ProtocolMarshaller protocolMarshaller) {

        if (instanceMetadataOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceMetadataOptions.getState(), STATE_BINDING);
            protocolMarshaller.marshall(instanceMetadataOptions.getHttpTokens(), HTTPTOKENS_BINDING);
            protocolMarshaller.marshall(instanceMetadataOptions.getHttpEndpoint(), HTTPENDPOINT_BINDING);
            protocolMarshaller.marshall(instanceMetadataOptions.getHttpPutResponseHopLimit(), HTTPPUTRESPONSEHOPLIMIT_BINDING);
            protocolMarshaller.marshall(instanceMetadataOptions.getHttpProtocolIpv6(), HTTPPROTOCOLIPV6_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
