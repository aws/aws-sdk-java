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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeRangeFilterValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeRangeFilterValueMarshaller {

    private static final MarshallingInfo<java.util.Date> STATICVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StaticValue").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ROLLINGDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RollingDate").build();
    private static final MarshallingInfo<String> PARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameter").build();

    private static final TimeRangeFilterValueMarshaller instance = new TimeRangeFilterValueMarshaller();

    public static TimeRangeFilterValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeRangeFilterValue timeRangeFilterValue, ProtocolMarshaller protocolMarshaller) {

        if (timeRangeFilterValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeRangeFilterValue.getStaticValue(), STATICVALUE_BINDING);
            protocolMarshaller.marshall(timeRangeFilterValue.getRollingDate(), ROLLINGDATE_BINDING);
            protocolMarshaller.marshall(timeRangeFilterValue.getParameter(), PARAMETER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
