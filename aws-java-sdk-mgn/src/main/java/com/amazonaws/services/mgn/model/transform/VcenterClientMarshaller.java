/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VcenterClientMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VcenterClientMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> DATACENTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datacenterName").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostname").build();
    private static final MarshallingInfo<String> LASTSEENDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSeenDatetime").build();
    private static final MarshallingInfo<Map> SOURCESERVERTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerTags").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> VCENTERCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vcenterClientID").build();
    private static final MarshallingInfo<String> VCENTERUUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vcenterUUID").build();

    private static final VcenterClientMarshaller instance = new VcenterClientMarshaller();

    public static VcenterClientMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VcenterClient vcenterClient, ProtocolMarshaller protocolMarshaller) {

        if (vcenterClient == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vcenterClient.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(vcenterClient.getDatacenterName(), DATACENTERNAME_BINDING);
            protocolMarshaller.marshall(vcenterClient.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(vcenterClient.getLastSeenDatetime(), LASTSEENDATETIME_BINDING);
            protocolMarshaller.marshall(vcenterClient.getSourceServerTags(), SOURCESERVERTAGS_BINDING);
            protocolMarshaller.marshall(vcenterClient.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(vcenterClient.getVcenterClientID(), VCENTERCLIENTID_BINDING);
            protocolMarshaller.marshall(vcenterClient.getVcenterUUID(), VCENTERUUID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
