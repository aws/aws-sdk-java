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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ColumnTooltipItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColumnTooltipItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> COLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Column").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Label").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Aggregation").build();

    private static final ColumnTooltipItemMarshaller instance = new ColumnTooltipItemMarshaller();

    public static ColumnTooltipItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColumnTooltipItem columnTooltipItem, ProtocolMarshaller protocolMarshaller) {

        if (columnTooltipItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(columnTooltipItem.getColumn(), COLUMN_BINDING);
            protocolMarshaller.marshall(columnTooltipItem.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(columnTooltipItem.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(columnTooltipItem.getAggregation(), AGGREGATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
