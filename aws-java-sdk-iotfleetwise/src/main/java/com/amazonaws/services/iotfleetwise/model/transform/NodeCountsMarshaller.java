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
package com.amazonaws.services.iotfleetwise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NodeCountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodeCountsMarshaller {

    private static final MarshallingInfo<Integer> TOTALNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalNodes").build();
    private static final MarshallingInfo<Integer> TOTALBRANCHES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalBranches").build();
    private static final MarshallingInfo<Integer> TOTALSENSORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalSensors").build();
    private static final MarshallingInfo<Integer> TOTALATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalAttributes").build();
    private static final MarshallingInfo<Integer> TOTALACTUATORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalActuators").build();

    private static final NodeCountsMarshaller instance = new NodeCountsMarshaller();

    public static NodeCountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NodeCounts nodeCounts, ProtocolMarshaller protocolMarshaller) {

        if (nodeCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nodeCounts.getTotalNodes(), TOTALNODES_BINDING);
            protocolMarshaller.marshall(nodeCounts.getTotalBranches(), TOTALBRANCHES_BINDING);
            protocolMarshaller.marshall(nodeCounts.getTotalSensors(), TOTALSENSORS_BINDING);
            protocolMarshaller.marshall(nodeCounts.getTotalAttributes(), TOTALATTRIBUTES_BINDING);
            protocolMarshaller.marshall(nodeCounts.getTotalActuators(), TOTALACTUATORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
