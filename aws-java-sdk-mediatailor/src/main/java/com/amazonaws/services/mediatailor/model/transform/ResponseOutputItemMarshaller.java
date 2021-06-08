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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResponseOutputItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResponseOutputItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> DASHPLAYLISTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DashPlaylistSettings").build();
    private static final MarshallingInfo<StructuredPojo> HLSPLAYLISTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HlsPlaylistSettings").build();
    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestName").build();
    private static final MarshallingInfo<String> PLAYBACKURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlaybackUrl").build();
    private static final MarshallingInfo<String> SOURCEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceGroup").build();

    private static final ResponseOutputItemMarshaller instance = new ResponseOutputItemMarshaller();

    public static ResponseOutputItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResponseOutputItem responseOutputItem, ProtocolMarshaller protocolMarshaller) {

        if (responseOutputItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(responseOutputItem.getDashPlaylistSettings(), DASHPLAYLISTSETTINGS_BINDING);
            protocolMarshaller.marshall(responseOutputItem.getHlsPlaylistSettings(), HLSPLAYLISTSETTINGS_BINDING);
            protocolMarshaller.marshall(responseOutputItem.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(responseOutputItem.getPlaybackUrl(), PLAYBACKURL_BINDING);
            protocolMarshaller.marshall(responseOutputItem.getSourceGroup(), SOURCEGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
