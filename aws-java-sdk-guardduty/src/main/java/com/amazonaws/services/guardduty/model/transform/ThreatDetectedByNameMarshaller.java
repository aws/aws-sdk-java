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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThreatDetectedByNameMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThreatDetectedByNameMarshaller {

    private static final MarshallingInfo<Integer> ITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("itemCount").build();
    private static final MarshallingInfo<Integer> UNIQUETHREATNAMECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uniqueThreatNameCount").build();
    private static final MarshallingInfo<Boolean> SHORTENED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shortened").build();
    private static final MarshallingInfo<List> THREATNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("threatNames").build();

    private static final ThreatDetectedByNameMarshaller instance = new ThreatDetectedByNameMarshaller();

    public static ThreatDetectedByNameMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThreatDetectedByName threatDetectedByName, ProtocolMarshaller protocolMarshaller) {

        if (threatDetectedByName == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(threatDetectedByName.getItemCount(), ITEMCOUNT_BINDING);
            protocolMarshaller.marshall(threatDetectedByName.getUniqueThreatNameCount(), UNIQUETHREATNAMECOUNT_BINDING);
            protocolMarshaller.marshall(threatDetectedByName.getShortened(), SHORTENED_BINDING);
            protocolMarshaller.marshall(threatDetectedByName.getThreatNames(), THREATNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
