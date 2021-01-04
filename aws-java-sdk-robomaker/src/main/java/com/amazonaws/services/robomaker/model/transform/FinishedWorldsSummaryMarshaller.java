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
package com.amazonaws.services.robomaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FinishedWorldsSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FinishedWorldsSummaryMarshaller {

    private static final MarshallingInfo<Integer> FINISHEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("finishedCount").build();
    private static final MarshallingInfo<List> SUCCEEDEDWORLDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("succeededWorlds").build();
    private static final MarshallingInfo<StructuredPojo> FAILURESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureSummary").build();

    private static final FinishedWorldsSummaryMarshaller instance = new FinishedWorldsSummaryMarshaller();

    public static FinishedWorldsSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FinishedWorldsSummary finishedWorldsSummary, ProtocolMarshaller protocolMarshaller) {

        if (finishedWorldsSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(finishedWorldsSummary.getFinishedCount(), FINISHEDCOUNT_BINDING);
            protocolMarshaller.marshall(finishedWorldsSummary.getSucceededWorlds(), SUCCEEDEDWORLDS_BINDING);
            protocolMarshaller.marshall(finishedWorldsSummary.getFailureSummary(), FAILURESUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
