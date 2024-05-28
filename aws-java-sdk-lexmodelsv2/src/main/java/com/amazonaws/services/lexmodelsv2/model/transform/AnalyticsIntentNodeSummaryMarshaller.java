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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnalyticsIntentNodeSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnalyticsIntentNodeSummaryMarshaller {

    private static final MarshallingInfo<String> INTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentName").build();
    private static final MarshallingInfo<String> INTENTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentPath").build();
    private static final MarshallingInfo<Integer> INTENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentCount").build();
    private static final MarshallingInfo<Integer> INTENTLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentLevel").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeType").build();

    private static final AnalyticsIntentNodeSummaryMarshaller instance = new AnalyticsIntentNodeSummaryMarshaller();

    public static AnalyticsIntentNodeSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnalyticsIntentNodeSummary analyticsIntentNodeSummary, ProtocolMarshaller protocolMarshaller) {

        if (analyticsIntentNodeSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(analyticsIntentNodeSummary.getIntentName(), INTENTNAME_BINDING);
            protocolMarshaller.marshall(analyticsIntentNodeSummary.getIntentPath(), INTENTPATH_BINDING);
            protocolMarshaller.marshall(analyticsIntentNodeSummary.getIntentCount(), INTENTCOUNT_BINDING);
            protocolMarshaller.marshall(analyticsIntentNodeSummary.getIntentLevel(), INTENTLEVEL_BINDING);
            protocolMarshaller.marshall(analyticsIntentNodeSummary.getNodeType(), NODETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
