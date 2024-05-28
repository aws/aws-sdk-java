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
package com.amazonaws.services.mediapackagev2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateOriginEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateOriginEndpointRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ChannelGroupName").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<String> ORIGINENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginEndpointName").build();
    private static final MarshallingInfo<String> CONTAINERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerType").build();
    private static final MarshallingInfo<StructuredPojo> SEGMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Segment").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amzn-client-token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> STARTOVERWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartoverWindowSeconds").build();
    private static final MarshallingInfo<List> HLSMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HlsManifests").build();
    private static final MarshallingInfo<List> LOWLATENCYHLSMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LowLatencyHlsManifests").build();
    private static final MarshallingInfo<List> DASHMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DashManifests").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateOriginEndpointRequestMarshaller instance = new CreateOriginEndpointRequestMarshaller();

    public static CreateOriginEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateOriginEndpointRequest createOriginEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (createOriginEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createOriginEndpointRequest.getChannelGroupName(), CHANNELGROUPNAME_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getOriginEndpointName(), ORIGINENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getContainerType(), CONTAINERTYPE_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getSegment(), SEGMENT_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getStartoverWindowSeconds(), STARTOVERWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getHlsManifests(), HLSMANIFESTS_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getLowLatencyHlsManifests(), LOWLATENCYHLSMANIFESTS_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getDashManifests(), DASHMANIFESTS_BINDING);
            protocolMarshaller.marshall(createOriginEndpointRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
