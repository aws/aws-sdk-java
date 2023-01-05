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
 * TableConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> TABLEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableOptions").build();
    private static final MarshallingInfo<StructuredPojo> TOTALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalOptions").build();
    private static final MarshallingInfo<StructuredPojo> FIELDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldOptions").build();
    private static final MarshallingInfo<StructuredPojo> PAGINATEDREPORTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaginatedReportOptions").build();

    private static final TableConfigurationMarshaller instance = new TableConfigurationMarshaller();

    public static TableConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableConfiguration tableConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (tableConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(tableConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(tableConfiguration.getTableOptions(), TABLEOPTIONS_BINDING);
            protocolMarshaller.marshall(tableConfiguration.getTotalOptions(), TOTALOPTIONS_BINDING);
            protocolMarshaller.marshall(tableConfiguration.getFieldOptions(), FIELDOPTIONS_BINDING);
            protocolMarshaller.marshall(tableConfiguration.getPaginatedReportOptions(), PAGINATEDREPORTOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
