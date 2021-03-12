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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SpliceInsertMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SpliceInsertMessageMarshaller {

    private static final MarshallingInfo<Integer> AVAILNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailNum").build();
    private static final MarshallingInfo<Integer> AVAILSEXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailsExpected").build();
    private static final MarshallingInfo<Integer> SPLICEEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpliceEventId").build();
    private static final MarshallingInfo<Integer> UNIQUEPROGRAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UniqueProgramId").build();

    private static final SpliceInsertMessageMarshaller instance = new SpliceInsertMessageMarshaller();

    public static SpliceInsertMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SpliceInsertMessage spliceInsertMessage, ProtocolMarshaller protocolMarshaller) {

        if (spliceInsertMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(spliceInsertMessage.getAvailNum(), AVAILNUM_BINDING);
            protocolMarshaller.marshall(spliceInsertMessage.getAvailsExpected(), AVAILSEXPECTED_BINDING);
            protocolMarshaller.marshall(spliceInsertMessage.getSpliceEventId(), SPLICEEVENTID_BINDING);
            protocolMarshaller.marshall(spliceInsertMessage.getUniqueProgramId(), UNIQUEPROGRAMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
