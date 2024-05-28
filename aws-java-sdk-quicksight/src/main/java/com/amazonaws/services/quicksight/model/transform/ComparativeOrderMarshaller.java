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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComparativeOrderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComparativeOrderMarshaller {

    private static final MarshallingInfo<String> USEORDERING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseOrdering").build();
    private static final MarshallingInfo<List> SPECIFEDORDER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SpecifedOrder").build();
    private static final MarshallingInfo<String> TREATUNDEFINEDSPECIFIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatUndefinedSpecifiedValues").build();

    private static final ComparativeOrderMarshaller instance = new ComparativeOrderMarshaller();

    public static ComparativeOrderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComparativeOrder comparativeOrder, ProtocolMarshaller protocolMarshaller) {

        if (comparativeOrder == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(comparativeOrder.getUseOrdering(), USEORDERING_BINDING);
            protocolMarshaller.marshall(comparativeOrder.getSpecifedOrder(), SPECIFEDORDER_BINDING);
            protocolMarshaller.marshall(comparativeOrder.getTreatUndefinedSpecifiedValues(), TREATUNDEFINEDSPECIFIEDVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
