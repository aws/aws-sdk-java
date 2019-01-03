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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InterconnectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InterconnectMarshaller {

    private static final MarshallingInfo<String> INTERCONNECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interconnectId").build();
    private static final MarshallingInfo<String> INTERCONNECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interconnectName").build();
    private static final MarshallingInfo<String> INTERCONNECTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interconnectState").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> BANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bandwidth").build();
    private static final MarshallingInfo<java.util.Date> LOAISSUETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loaIssueTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LAGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagId").build();
    private static final MarshallingInfo<String> AWSDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsDevice").build();
    private static final MarshallingInfo<Boolean> JUMBOFRAMECAPABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jumboFrameCapable").build();
    private static final MarshallingInfo<String> AWSDEVICEV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsDeviceV2").build();
    private static final MarshallingInfo<String> HASLOGICALREDUNDANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hasLogicalRedundancy").build();

    private static final InterconnectMarshaller instance = new InterconnectMarshaller();

    public static InterconnectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Interconnect interconnect, ProtocolMarshaller protocolMarshaller) {

        if (interconnect == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(interconnect.getInterconnectId(), INTERCONNECTID_BINDING);
            protocolMarshaller.marshall(interconnect.getInterconnectName(), INTERCONNECTNAME_BINDING);
            protocolMarshaller.marshall(interconnect.getInterconnectState(), INTERCONNECTSTATE_BINDING);
            protocolMarshaller.marshall(interconnect.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(interconnect.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(interconnect.getBandwidth(), BANDWIDTH_BINDING);
            protocolMarshaller.marshall(interconnect.getLoaIssueTime(), LOAISSUETIME_BINDING);
            protocolMarshaller.marshall(interconnect.getLagId(), LAGID_BINDING);
            protocolMarshaller.marshall(interconnect.getAwsDevice(), AWSDEVICE_BINDING);
            protocolMarshaller.marshall(interconnect.getJumboFrameCapable(), JUMBOFRAMECAPABLE_BINDING);
            protocolMarshaller.marshall(interconnect.getAwsDeviceV2(), AWSDEVICEV2_BINDING);
            protocolMarshaller.marshall(interconnect.getHasLogicalRedundancy(), HASLOGICALREDUNDANCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
