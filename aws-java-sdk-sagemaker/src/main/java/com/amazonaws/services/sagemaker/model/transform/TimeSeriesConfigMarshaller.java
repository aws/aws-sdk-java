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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesConfigMarshaller {

    private static final MarshallingInfo<String> TARGETATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetAttributeName").build();
    private static final MarshallingInfo<String> TIMESTAMPATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimestampAttributeName").build();
    private static final MarshallingInfo<String> ITEMIDENTIFIERATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemIdentifierAttributeName").build();
    private static final MarshallingInfo<List> GROUPINGATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupingAttributeNames").build();

    private static final TimeSeriesConfigMarshaller instance = new TimeSeriesConfigMarshaller();

    public static TimeSeriesConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesConfig timeSeriesConfig, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesConfig.getTargetAttributeName(), TARGETATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(timeSeriesConfig.getTimestampAttributeName(), TIMESTAMPATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(timeSeriesConfig.getItemIdentifierAttributeName(), ITEMIDENTIFIERATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(timeSeriesConfig.getGroupingAttributeNames(), GROUPINGATTRIBUTENAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
