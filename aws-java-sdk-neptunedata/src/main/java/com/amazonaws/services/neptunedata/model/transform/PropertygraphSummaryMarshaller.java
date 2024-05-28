/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PropertygraphSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PropertygraphSummaryMarshaller {

    private static final MarshallingInfo<Long> NUMNODES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numNodes").build();
    private static final MarshallingInfo<Long> NUMEDGES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numEdges").build();
    private static final MarshallingInfo<Long> NUMNODELABELS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numNodeLabels").build();
    private static final MarshallingInfo<Long> NUMEDGELABELS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numEdgeLabels").build();
    private static final MarshallingInfo<List> NODELABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeLabels").build();
    private static final MarshallingInfo<List> EDGELABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("edgeLabels").build();
    private static final MarshallingInfo<Long> NUMNODEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numNodeProperties").build();
    private static final MarshallingInfo<Long> NUMEDGEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numEdgeProperties").build();
    private static final MarshallingInfo<List> NODEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodeProperties").build();
    private static final MarshallingInfo<List> EDGEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("edgeProperties").build();
    private static final MarshallingInfo<Long> TOTALNODEPROPERTYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalNodePropertyValues").build();
    private static final MarshallingInfo<Long> TOTALEDGEPROPERTYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalEdgePropertyValues").build();
    private static final MarshallingInfo<List> NODESTRUCTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodeStructures").build();
    private static final MarshallingInfo<List> EDGESTRUCTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("edgeStructures").build();

    private static final PropertygraphSummaryMarshaller instance = new PropertygraphSummaryMarshaller();

    public static PropertygraphSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PropertygraphSummary propertygraphSummary, ProtocolMarshaller protocolMarshaller) {

        if (propertygraphSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(propertygraphSummary.getNumNodes(), NUMNODES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNumEdges(), NUMEDGES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNumNodeLabels(), NUMNODELABELS_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNumEdgeLabels(), NUMEDGELABELS_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNodeLabels(), NODELABELS_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getEdgeLabels(), EDGELABELS_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNumNodeProperties(), NUMNODEPROPERTIES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNumEdgeProperties(), NUMEDGEPROPERTIES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNodeProperties(), NODEPROPERTIES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getEdgeProperties(), EDGEPROPERTIES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getTotalNodePropertyValues(), TOTALNODEPROPERTYVALUES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getTotalEdgePropertyValues(), TOTALEDGEPROPERTYVALUES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getNodeStructures(), NODESTRUCTURES_BINDING);
            protocolMarshaller.marshall(propertygraphSummary.getEdgeStructures(), EDGESTRUCTURES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
