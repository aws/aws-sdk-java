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
 * NielsenNonLinearWatermarkSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NielsenNonLinearWatermarkSettingsMarshaller {

    private static final MarshallingInfo<String> ACTIVEWATERMARKPROCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeWatermarkProcess").build();
    private static final MarshallingInfo<String> ADIFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adiFilename").build();
    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> ASSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("assetName").build();
    private static final MarshallingInfo<String> CBETSOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cbetSourceId").build();
    private static final MarshallingInfo<String> EPISODEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("episodeId").build();
    private static final MarshallingInfo<String> METADATADESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadataDestination").build();
    private static final MarshallingInfo<Integer> SOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceId").build();
    private static final MarshallingInfo<String> SOURCEWATERMARKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceWatermarkStatus").build();
    private static final MarshallingInfo<String> TICSERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ticServerUrl").build();
    private static final MarshallingInfo<String> UNIQUETICPERAUDIOTRACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uniqueTicPerAudioTrack").build();

    private static final NielsenNonLinearWatermarkSettingsMarshaller instance = new NielsenNonLinearWatermarkSettingsMarshaller();

    public static NielsenNonLinearWatermarkSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NielsenNonLinearWatermarkSettings nielsenNonLinearWatermarkSettings, ProtocolMarshaller protocolMarshaller) {

        if (nielsenNonLinearWatermarkSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getActiveWatermarkProcess(), ACTIVEWATERMARKPROCESS_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getAdiFilename(), ADIFILENAME_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getAssetName(), ASSETNAME_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getCbetSourceId(), CBETSOURCEID_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getEpisodeId(), EPISODEID_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getMetadataDestination(), METADATADESTINATION_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getSourceId(), SOURCEID_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getSourceWatermarkStatus(), SOURCEWATERMARKSTATUS_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getTicServerUrl(), TICSERVERURL_BINDING);
            protocolMarshaller.marshall(nielsenNonLinearWatermarkSettings.getUniqueTicPerAudioTrack(), UNIQUETICPERAUDIOTRACK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
