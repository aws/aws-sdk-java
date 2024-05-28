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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntryViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntryViolationMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXPECTEDENTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedEntry").build();
    private static final MarshallingInfo<String> EXPECTEDEVALUATIONORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedEvaluationOrder").build();
    private static final MarshallingInfo<String> ACTUALEVALUATIONORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualEvaluationOrder").build();
    private static final MarshallingInfo<StructuredPojo> ENTRYATEXPECTEDEVALUATIONORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntryAtExpectedEvaluationOrder").build();
    private static final MarshallingInfo<List> ENTRIESWITHCONFLICTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntriesWithConflicts").build();
    private static final MarshallingInfo<List> ENTRYVIOLATIONREASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntryViolationReasons").build();

    private static final EntryViolationMarshaller instance = new EntryViolationMarshaller();

    public static EntryViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntryViolation entryViolation, ProtocolMarshaller protocolMarshaller) {

        if (entryViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entryViolation.getExpectedEntry(), EXPECTEDENTRY_BINDING);
            protocolMarshaller.marshall(entryViolation.getExpectedEvaluationOrder(), EXPECTEDEVALUATIONORDER_BINDING);
            protocolMarshaller.marshall(entryViolation.getActualEvaluationOrder(), ACTUALEVALUATIONORDER_BINDING);
            protocolMarshaller.marshall(entryViolation.getEntryAtExpectedEvaluationOrder(), ENTRYATEXPECTEDEVALUATIONORDER_BINDING);
            protocolMarshaller.marshall(entryViolation.getEntriesWithConflicts(), ENTRIESWITHCONFLICTS_BINDING);
            protocolMarshaller.marshall(entryViolation.getEntryViolationReasons(), ENTRYVIOLATIONREASONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
