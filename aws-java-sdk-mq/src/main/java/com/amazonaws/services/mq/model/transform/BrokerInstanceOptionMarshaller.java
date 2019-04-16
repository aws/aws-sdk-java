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
package com.amazonaws.services.mq.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BrokerInstanceOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BrokerInstanceOptionMarshaller {

    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZones").build();
    private static final MarshallingInfo<String> ENGINETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineType").build();
    private static final MarshallingInfo<String> HOSTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostInstanceType").build();
    private static final MarshallingInfo<List> SUPPORTEDENGINEVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedEngineVersions").build();

    private static final BrokerInstanceOptionMarshaller instance = new BrokerInstanceOptionMarshaller();

    public static BrokerInstanceOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BrokerInstanceOption brokerInstanceOption, ProtocolMarshaller protocolMarshaller) {

        if (brokerInstanceOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(brokerInstanceOption.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(brokerInstanceOption.getEngineType(), ENGINETYPE_BINDING);
            protocolMarshaller.marshall(brokerInstanceOption.getHostInstanceType(), HOSTINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(brokerInstanceOption.getSupportedEngineVersions(), SUPPORTEDENGINEVERSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
