/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OccurrencesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OccurrencesMarshaller {

    private static final MarshallingInfo<List> LINERANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LineRanges").build();
    private static final MarshallingInfo<List> OFFSETRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OffsetRanges").build();
    private static final MarshallingInfo<List> PAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pages").build();
    private static final MarshallingInfo<List> RECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Records").build();
    private static final MarshallingInfo<List> CELLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cells").build();

    private static final OccurrencesMarshaller instance = new OccurrencesMarshaller();

    public static OccurrencesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Occurrences occurrences, ProtocolMarshaller protocolMarshaller) {

        if (occurrences == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(occurrences.getLineRanges(), LINERANGES_BINDING);
            protocolMarshaller.marshall(occurrences.getOffsetRanges(), OFFSETRANGES_BINDING);
            protocolMarshaller.marshall(occurrences.getPages(), PAGES_BINDING);
            protocolMarshaller.marshall(occurrences.getRecords(), RECORDS_BINDING);
            protocolMarshaller.marshall(occurrences.getCells(), CELLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
