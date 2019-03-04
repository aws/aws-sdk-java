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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackage.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OriginEndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OriginEndpointMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channelId").build();
    private static final MarshallingInfo<StructuredPojo> CMAFPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cmafPackage").build();
    private static final MarshallingInfo<StructuredPojo> DASHPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashPackage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> HLSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsPackage").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestName").build();
    private static final MarshallingInfo<StructuredPojo> MSSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mssPackage").build();
    private static final MarshallingInfo<Integer> STARTOVERWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startoverWindowSeconds").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<Integer> TIMEDELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeDelaySeconds").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();
    private static final MarshallingInfo<List> WHITELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("whitelist").build();

    private static final OriginEndpointMarshaller instance = new OriginEndpointMarshaller();

    public static OriginEndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OriginEndpoint originEndpoint, ProtocolMarshaller protocolMarshaller) {

        if (originEndpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(originEndpoint.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(originEndpoint.getChannelId(), CHANNELID_BINDING);
            protocolMarshaller.marshall(originEndpoint.getCmafPackage(), CMAFPACKAGE_BINDING);
            protocolMarshaller.marshall(originEndpoint.getDashPackage(), DASHPACKAGE_BINDING);
            protocolMarshaller.marshall(originEndpoint.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(originEndpoint.getHlsPackage(), HLSPACKAGE_BINDING);
            protocolMarshaller.marshall(originEndpoint.getId(), ID_BINDING);
            protocolMarshaller.marshall(originEndpoint.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(originEndpoint.getMssPackage(), MSSPACKAGE_BINDING);
            protocolMarshaller.marshall(originEndpoint.getStartoverWindowSeconds(), STARTOVERWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(originEndpoint.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(originEndpoint.getTimeDelaySeconds(), TIMEDELAYSECONDS_BINDING);
            protocolMarshaller.marshall(originEndpoint.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(originEndpoint.getWhitelist(), WHITELIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
