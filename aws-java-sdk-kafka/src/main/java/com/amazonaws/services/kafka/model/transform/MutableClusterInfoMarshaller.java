/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MutableClusterInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MutableClusterInfoMarshaller {

    private static final MarshallingInfo<List> BROKEREBSVOLUMEINFO_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerEBSVolumeInfo").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationInfo").build();
    private static final MarshallingInfo<Integer> NUMBEROFBROKERNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfBrokerNodes").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> OPENMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openMonitoring").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingInfo").build();

    private static final MutableClusterInfoMarshaller instance = new MutableClusterInfoMarshaller();

    public static MutableClusterInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MutableClusterInfo mutableClusterInfo, ProtocolMarshaller protocolMarshaller) {

        if (mutableClusterInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mutableClusterInfo.getBrokerEBSVolumeInfo(), BROKEREBSVOLUMEINFO_BINDING);
            protocolMarshaller.marshall(mutableClusterInfo.getConfigurationInfo(), CONFIGURATIONINFO_BINDING);
            protocolMarshaller.marshall(mutableClusterInfo.getNumberOfBrokerNodes(), NUMBEROFBROKERNODES_BINDING);
            protocolMarshaller.marshall(mutableClusterInfo.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(mutableClusterInfo.getOpenMonitoring(), OPENMONITORING_BINDING);
            protocolMarshaller.marshall(mutableClusterInfo.getLoggingInfo(), LOGGINGINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
