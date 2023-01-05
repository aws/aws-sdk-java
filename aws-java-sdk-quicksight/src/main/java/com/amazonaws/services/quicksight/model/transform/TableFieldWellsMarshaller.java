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
 * TableFieldWellsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableFieldWellsMarshaller {

    private static final MarshallingInfo<StructuredPojo> TABLEAGGREGATEDFIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableAggregatedFieldWells").build();
    private static final MarshallingInfo<StructuredPojo> TABLEUNAGGREGATEDFIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableUnaggregatedFieldWells").build();

    private static final TableFieldWellsMarshaller instance = new TableFieldWellsMarshaller();

    public static TableFieldWellsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableFieldWells tableFieldWells, ProtocolMarshaller protocolMarshaller) {

        if (tableFieldWells == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableFieldWells.getTableAggregatedFieldWells(), TABLEAGGREGATEDFIELDWELLS_BINDING);
            protocolMarshaller.marshall(tableFieldWells.getTableUnaggregatedFieldWells(), TABLEUNAGGREGATEDFIELDWELLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
