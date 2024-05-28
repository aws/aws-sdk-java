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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnaplockRetentionPeriodMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnaplockRetentionPeriodMarshaller {

    private static final MarshallingInfo<StructuredPojo> DEFAULTRETENTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRetention").build();
    private static final MarshallingInfo<StructuredPojo> MINIMUMRETENTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumRetention").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMRETENTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRetention").build();

    private static final SnaplockRetentionPeriodMarshaller instance = new SnaplockRetentionPeriodMarshaller();

    public static SnaplockRetentionPeriodMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnaplockRetentionPeriod snaplockRetentionPeriod, ProtocolMarshaller protocolMarshaller) {

        if (snaplockRetentionPeriod == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snaplockRetentionPeriod.getDefaultRetention(), DEFAULTRETENTION_BINDING);
            protocolMarshaller.marshall(snaplockRetentionPeriod.getMinimumRetention(), MINIMUMRETENTION_BINDING);
            protocolMarshaller.marshall(snaplockRetentionPeriod.getMaximumRetention(), MAXIMUMRETENTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
