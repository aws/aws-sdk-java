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
 * InsightHealthMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsightHealthMarshaller {

    private static final MarshallingInfo<Integer> OPENPROACTIVEINSIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenProactiveInsights").build();
    private static final MarshallingInfo<Integer> OPENREACTIVEINSIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenReactiveInsights").build();
    private static final MarshallingInfo<Long> MEANTIMETORECOVERINMILLISECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeanTimeToRecoverInMilliseconds").build();

    private static final InsightHealthMarshaller instance = new InsightHealthMarshaller();

    public static InsightHealthMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsightHealth insightHealth, ProtocolMarshaller protocolMarshaller) {

        if (insightHealth == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insightHealth.getOpenProactiveInsights(), OPENPROACTIVEINSIGHTS_BINDING);
            protocolMarshaller.marshall(insightHealth.getOpenReactiveInsights(), OPENREACTIVEINSIGHTS_BINDING);
            protocolMarshaller.marshall(insightHealth.getMeanTimeToRecoverInMilliseconds(), MEANTIMETORECOVERINMILLISECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
