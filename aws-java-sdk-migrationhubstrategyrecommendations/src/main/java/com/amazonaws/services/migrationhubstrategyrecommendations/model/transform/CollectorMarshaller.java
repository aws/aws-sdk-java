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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollectorMarshaller {

    private static final MarshallingInfo<String> COLLECTORHEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectorHealth").build();
    private static final MarshallingInfo<String> COLLECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectorId").build();
    private static final MarshallingInfo<String> COLLECTORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectorVersion").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationSummary").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostName").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipAddress").build();
    private static final MarshallingInfo<String> LASTACTIVITYTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastActivityTimeStamp").build();
    private static final MarshallingInfo<String> REGISTEREDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredTimeStamp").build();

    private static final CollectorMarshaller instance = new CollectorMarshaller();

    public static CollectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Collector collector, ProtocolMarshaller protocolMarshaller) {

        if (collector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collector.getCollectorHealth(), COLLECTORHEALTH_BINDING);
            protocolMarshaller.marshall(collector.getCollectorId(), COLLECTORID_BINDING);
            protocolMarshaller.marshall(collector.getCollectorVersion(), COLLECTORVERSION_BINDING);
            protocolMarshaller.marshall(collector.getConfigurationSummary(), CONFIGURATIONSUMMARY_BINDING);
            protocolMarshaller.marshall(collector.getHostName(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(collector.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(collector.getLastActivityTimeStamp(), LASTACTIVITYTIMESTAMP_BINDING);
            protocolMarshaller.marshall(collector.getRegisteredTimeStamp(), REGISTEREDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
