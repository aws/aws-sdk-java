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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackage.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateOriginEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateOriginEndpointRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CMAFPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cmafPackage").build();
    private static final MarshallingInfo<StructuredPojo> DASHPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashPackage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> HLSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsPackage").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestName").build();
    private static final MarshallingInfo<StructuredPojo> MSSPACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mssPackage").build();
    private static final MarshallingInfo<Integer> STARTOVERWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startoverWindowSeconds").build();
    private static final MarshallingInfo<Integer> TIMEDELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeDelaySeconds").build();
    private static final MarshallingInfo<List> WHITELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("whitelist").build();

    private static final UpdateOriginEndpointRequestMarshaller instance = new UpdateOriginEndpointRequestMarshaller();

    public static UpdateOriginEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateOriginEndpointRequest updateOriginEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateOriginEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateOriginEndpointRequest.getCmafPackage(), CMAFPACKAGE_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getDashPackage(), DASHPACKAGE_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getHlsPackage(), HLSPACKAGE_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getMssPackage(), MSSPACKAGE_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getStartoverWindowSeconds(), STARTOVERWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getTimeDelaySeconds(), TIMEDELAYSECONDS_BINDING);
            protocolMarshaller.marshall(updateOriginEndpointRequest.getWhitelist(), WHITELIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
