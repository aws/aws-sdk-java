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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListInsightsStatusFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListInsightsStatusFilterMarshaller {

    private static final MarshallingInfo<StructuredPojo> ONGOING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ongoing").build();
    private static final MarshallingInfo<StructuredPojo> CLOSED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Closed").build();
    private static final MarshallingInfo<StructuredPojo> ANY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Any").build();

    private static final ListInsightsStatusFilterMarshaller instance = new ListInsightsStatusFilterMarshaller();

    public static ListInsightsStatusFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListInsightsStatusFilter listInsightsStatusFilter, ProtocolMarshaller protocolMarshaller) {

        if (listInsightsStatusFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listInsightsStatusFilter.getOngoing(), ONGOING_BINDING);
            protocolMarshaller.marshall(listInsightsStatusFilter.getClosed(), CLOSED_BINDING);
            protocolMarshaller.marshall(listInsightsStatusFilter.getAny(), ANY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
