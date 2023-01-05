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
package com.amazonaws.services.outposts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RackPhysicalPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RackPhysicalPropertiesMarshaller {

    private static final MarshallingInfo<String> POWERDRAWKVA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PowerDrawKva").build();
    private static final MarshallingInfo<String> POWERPHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PowerPhase").build();
    private static final MarshallingInfo<String> POWERCONNECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PowerConnector").build();
    private static final MarshallingInfo<String> POWERFEEDDROP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PowerFeedDrop").build();
    private static final MarshallingInfo<String> UPLINKGBPS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UplinkGbps").build();
    private static final MarshallingInfo<String> UPLINKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UplinkCount").build();
    private static final MarshallingInfo<String> FIBEROPTICCABLETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FiberOpticCableType").build();
    private static final MarshallingInfo<String> OPTICALSTANDARD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpticalStandard").build();
    private static final MarshallingInfo<String> MAXIMUMSUPPORTEDWEIGHTLBS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumSupportedWeightLbs").build();

    private static final RackPhysicalPropertiesMarshaller instance = new RackPhysicalPropertiesMarshaller();

    public static RackPhysicalPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RackPhysicalProperties rackPhysicalProperties, ProtocolMarshaller protocolMarshaller) {

        if (rackPhysicalProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rackPhysicalProperties.getPowerDrawKva(), POWERDRAWKVA_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getPowerPhase(), POWERPHASE_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getPowerConnector(), POWERCONNECTOR_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getPowerFeedDrop(), POWERFEEDDROP_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getUplinkGbps(), UPLINKGBPS_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getUplinkCount(), UPLINKCOUNT_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getFiberOpticCableType(), FIBEROPTICCABLETYPE_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getOpticalStandard(), OPTICALSTANDARD_BINDING);
            protocolMarshaller.marshall(rackPhysicalProperties.getMaximumSupportedWeightLbs(), MAXIMUMSUPPORTEDWEIGHTLBS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
