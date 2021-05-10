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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KantarWatermarkSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KantarWatermarkSettingsMarshaller {

    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelName").build();
    private static final MarshallingInfo<String> CONTENTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentReference").build();
    private static final MarshallingInfo<String> CREDENTIALSSECRETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsSecretName").build();
    private static final MarshallingInfo<Double> FILEOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileOffset").build();
    private static final MarshallingInfo<Integer> KANTARLICENSEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kantarLicenseId").build();
    private static final MarshallingInfo<String> KANTARSERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kantarServerUrl").build();
    private static final MarshallingInfo<String> LOGDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logDestination").build();
    private static final MarshallingInfo<String> METADATA3_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata3").build();
    private static final MarshallingInfo<String> METADATA4_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata4").build();
    private static final MarshallingInfo<String> METADATA5_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata5").build();
    private static final MarshallingInfo<String> METADATA6_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata6").build();
    private static final MarshallingInfo<String> METADATA7_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata7").build();
    private static final MarshallingInfo<String> METADATA8_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metadata8").build();

    private static final KantarWatermarkSettingsMarshaller instance = new KantarWatermarkSettingsMarshaller();

    public static KantarWatermarkSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KantarWatermarkSettings kantarWatermarkSettings, ProtocolMarshaller protocolMarshaller) {

        if (kantarWatermarkSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kantarWatermarkSettings.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getContentReference(), CONTENTREFERENCE_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getCredentialsSecretName(), CREDENTIALSSECRETNAME_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getFileOffset(), FILEOFFSET_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getKantarLicenseId(), KANTARLICENSEID_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getKantarServerUrl(), KANTARSERVERURL_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getLogDestination(), LOGDESTINATION_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata3(), METADATA3_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata4(), METADATA4_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata5(), METADATA5_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata6(), METADATA6_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata7(), METADATA7_BINDING);
            protocolMarshaller.marshall(kantarWatermarkSettings.getMetadata8(), METADATA8_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
