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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OriginEndpointListConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OriginEndpointListConfigurationMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CHANNELGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelGroupName").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<String> ORIGINENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginEndpointName").build();
    private static final MarshallingInfo<String> CONTAINERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> HLSMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HlsManifests").build();
    private static final MarshallingInfo<List> LOWLATENCYHLSMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LowLatencyHlsManifests").build();
    private static final MarshallingInfo<List> DASHMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DashManifests").build();

    private static final OriginEndpointListConfigurationMarshaller instance = new OriginEndpointListConfigurationMarshaller();

    public static OriginEndpointListConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OriginEndpointListConfiguration originEndpointListConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (originEndpointListConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(originEndpointListConfiguration.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getChannelGroupName(), CHANNELGROUPNAME_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getOriginEndpointName(), ORIGINENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getContainerType(), CONTAINERTYPE_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getModifiedAt(), MODIFIEDAT_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getHlsManifests(), HLSMANIFESTS_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getLowLatencyHlsManifests(), LOWLATENCYHLSMANIFESTS_BINDING);
            protocolMarshaller.marshall(originEndpointListConfiguration.getDashManifests(), DASHMANIFESTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
