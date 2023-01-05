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
package com.amazonaws.services.chimesdkmessaging.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmessaging.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ElasticChannelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ElasticChannelConfigurationMarshaller {

    private static final MarshallingInfo<Integer> MAXIMUMSUBCHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumSubChannels").build();
    private static final MarshallingInfo<Integer> TARGETMEMBERSHIPSPERSUBCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetMembershipsPerSubChannel").build();
    private static final MarshallingInfo<Integer> MINIMUMMEMBERSHIPPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumMembershipPercentage").build();

    private static final ElasticChannelConfigurationMarshaller instance = new ElasticChannelConfigurationMarshaller();

    public static ElasticChannelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ElasticChannelConfiguration elasticChannelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (elasticChannelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(elasticChannelConfiguration.getMaximumSubChannels(), MAXIMUMSUBCHANNELS_BINDING);
            protocolMarshaller.marshall(elasticChannelConfiguration.getTargetMembershipsPerSubChannel(), TARGETMEMBERSHIPSPERSUBCHANNEL_BINDING);
            protocolMarshaller.marshall(elasticChannelConfiguration.getMinimumMembershipPercentage(), MINIMUMMEMBERSHIPPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
