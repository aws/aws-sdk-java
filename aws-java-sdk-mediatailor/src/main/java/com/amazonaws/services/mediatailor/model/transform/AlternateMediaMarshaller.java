/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlternateMediaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlternateMediaMarshaller {

    private static final MarshallingInfo<List> ADBREAKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AdBreaks").build();
    private static final MarshallingInfo<StructuredPojo> CLIPRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClipRange").build();
    private static final MarshallingInfo<Long> DURATIONMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationMillis").build();
    private static final MarshallingInfo<String> LIVESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LiveSourceName").build();
    private static final MarshallingInfo<Long> SCHEDULEDSTARTTIMEMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledStartTimeMillis").build();
    private static final MarshallingInfo<String> SOURCELOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLocationName").build();
    private static final MarshallingInfo<String> VODSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VodSourceName").build();

    private static final AlternateMediaMarshaller instance = new AlternateMediaMarshaller();

    public static AlternateMediaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlternateMedia alternateMedia, ProtocolMarshaller protocolMarshaller) {

        if (alternateMedia == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alternateMedia.getAdBreaks(), ADBREAKS_BINDING);
            protocolMarshaller.marshall(alternateMedia.getClipRange(), CLIPRANGE_BINDING);
            protocolMarshaller.marshall(alternateMedia.getDurationMillis(), DURATIONMILLIS_BINDING);
            protocolMarshaller.marshall(alternateMedia.getLiveSourceName(), LIVESOURCENAME_BINDING);
            protocolMarshaller.marshall(alternateMedia.getScheduledStartTimeMillis(), SCHEDULEDSTARTTIMEMILLIS_BINDING);
            protocolMarshaller.marshall(alternateMedia.getSourceLocationName(), SOURCELOCATIONNAME_BINDING);
            protocolMarshaller.marshall(alternateMedia.getVodSourceName(), VODSOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
