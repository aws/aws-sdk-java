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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SankeyDiagramSortConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SankeyDiagramSortConfigurationMarshaller {

    private static final MarshallingInfo<List> WEIGHTSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WeightSort").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEITEMSLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceItemsLimit").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONITEMSLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationItemsLimit").build();

    private static final SankeyDiagramSortConfigurationMarshaller instance = new SankeyDiagramSortConfigurationMarshaller();

    public static SankeyDiagramSortConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SankeyDiagramSortConfiguration sankeyDiagramSortConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sankeyDiagramSortConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sankeyDiagramSortConfiguration.getWeightSort(), WEIGHTSORT_BINDING);
            protocolMarshaller.marshall(sankeyDiagramSortConfiguration.getSourceItemsLimit(), SOURCEITEMSLIMIT_BINDING);
            protocolMarshaller.marshall(sankeyDiagramSortConfiguration.getDestinationItemsLimit(), DESTINATIONITEMSLIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
