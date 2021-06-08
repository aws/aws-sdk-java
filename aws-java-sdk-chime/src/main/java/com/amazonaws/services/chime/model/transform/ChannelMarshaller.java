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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChannelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChannelMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelArn").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<String> PRIVACY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Privacy").build();
    private static final MarshallingInfo<String> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metadata").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMESSAGETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastMessageTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTimestamp").timestampFormat("unixTimestamp").build();

    private static final ChannelMarshaller instance = new ChannelMarshaller();

    public static ChannelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Channel channel, ProtocolMarshaller protocolMarshaller) {

        if (channel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(channel.getName(), NAME_BINDING);
            protocolMarshaller.marshall(channel.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(channel.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(channel.getPrivacy(), PRIVACY_BINDING);
            protocolMarshaller.marshall(channel.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(channel.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(channel.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(channel.getLastMessageTimestamp(), LASTMESSAGETIMESTAMP_BINDING);
            protocolMarshaller.marshall(channel.getLastUpdatedTimestamp(), LASTUPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
