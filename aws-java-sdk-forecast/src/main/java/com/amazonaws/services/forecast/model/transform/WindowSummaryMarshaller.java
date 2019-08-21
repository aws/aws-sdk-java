/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WindowSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WindowSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> TESTWINDOWSTART_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestWindowStart").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TESTWINDOWEND_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestWindowEnd").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> ITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemCount").build();
    private static final MarshallingInfo<String> EVALUATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationType").build();
    private static final MarshallingInfo<StructuredPojo> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Metrics").build();

    private static final WindowSummaryMarshaller instance = new WindowSummaryMarshaller();

    public static WindowSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WindowSummary windowSummary, ProtocolMarshaller protocolMarshaller) {

        if (windowSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(windowSummary.getTestWindowStart(), TESTWINDOWSTART_BINDING);
            protocolMarshaller.marshall(windowSummary.getTestWindowEnd(), TESTWINDOWEND_BINDING);
            protocolMarshaller.marshall(windowSummary.getItemCount(), ITEMCOUNT_BINDING);
            protocolMarshaller.marshall(windowSummary.getEvaluationType(), EVALUATIONTYPE_BINDING);
            protocolMarshaller.marshall(windowSummary.getMetrics(), METRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
