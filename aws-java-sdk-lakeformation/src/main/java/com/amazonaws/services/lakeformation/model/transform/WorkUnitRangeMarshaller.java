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
package com.amazonaws.services.lakeformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkUnitRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkUnitRangeMarshaller {

    private static final MarshallingInfo<Long> WORKUNITIDMAX_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkUnitIdMax").build();
    private static final MarshallingInfo<Long> WORKUNITIDMIN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WorkUnitIdMin").build();
    private static final MarshallingInfo<String> WORKUNITTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkUnitToken").build();

    private static final WorkUnitRangeMarshaller instance = new WorkUnitRangeMarshaller();

    public static WorkUnitRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkUnitRange workUnitRange, ProtocolMarshaller protocolMarshaller) {

        if (workUnitRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workUnitRange.getWorkUnitIdMax(), WORKUNITIDMAX_BINDING);
            protocolMarshaller.marshall(workUnitRange.getWorkUnitIdMin(), WORKUNITIDMIN_BINDING);
            protocolMarshaller.marshall(workUnitRange.getWorkUnitToken(), WORKUNITTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
