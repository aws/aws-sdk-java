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
package com.amazonaws.services.mediapackage.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackage.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsManifestCreateOrUpdateParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsManifestCreateOrUpdateParametersMarshaller {

    private static final MarshallingInfo<String> ADMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("adMarkers").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Boolean> INCLUDEIFRAMEONLYSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeIframeOnlyStream").build();
    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestName").build();
    private static final MarshallingInfo<String> PLAYLISTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("playlistType").build();
    private static final MarshallingInfo<Integer> PLAYLISTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("playlistWindowSeconds").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTimeIntervalSeconds").build();

    private static final HlsManifestCreateOrUpdateParametersMarshaller instance = new HlsManifestCreateOrUpdateParametersMarshaller();

    public static HlsManifestCreateOrUpdateParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsManifestCreateOrUpdateParameters hlsManifestCreateOrUpdateParameters, ProtocolMarshaller protocolMarshaller) {

        if (hlsManifestCreateOrUpdateParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getAdMarkers(), ADMARKERS_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getId(), ID_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getIncludeIframeOnlyStream(), INCLUDEIFRAMEONLYSTREAM_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getPlaylistType(), PLAYLISTTYPE_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getPlaylistWindowSeconds(), PLAYLISTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(hlsManifestCreateOrUpdateParameters.getProgramDateTimeIntervalSeconds(), PROGRAMDATETIMEINTERVALSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
