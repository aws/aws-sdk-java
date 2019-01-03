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
 * HlsPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsPackageMarshaller {

    private static final MarshallingInfo<String> ADMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("adMarkers").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Boolean> INCLUDEIFRAMEONLYSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeIframeOnlyStream").build();
    private static final MarshallingInfo<String> PLAYLISTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("playlistType").build();
    private static final MarshallingInfo<Integer> PLAYLISTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("playlistWindowSeconds").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTimeIntervalSeconds").build();
    private static final MarshallingInfo<Integer> SEGMENTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentDurationSeconds").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamSelection").build();
    private static final MarshallingInfo<Boolean> USEAUDIORENDITIONGROUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useAudioRenditionGroup").build();

    private static final HlsPackageMarshaller instance = new HlsPackageMarshaller();

    public static HlsPackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsPackage hlsPackage, ProtocolMarshaller protocolMarshaller) {

        if (hlsPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsPackage.getAdMarkers(), ADMARKERS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(hlsPackage.getIncludeIframeOnlyStream(), INCLUDEIFRAMEONLYSTREAM_BINDING);
            protocolMarshaller.marshall(hlsPackage.getPlaylistType(), PLAYLISTTYPE_BINDING);
            protocolMarshaller.marshall(hlsPackage.getPlaylistWindowSeconds(), PLAYLISTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getProgramDateTimeIntervalSeconds(), PROGRAMDATETIMEINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getSegmentDurationSeconds(), SEGMENTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getStreamSelection(), STREAMSELECTION_BINDING);
            protocolMarshaller.marshall(hlsPackage.getUseAudioRenditionGroup(), USEAUDIORENDITIONGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
