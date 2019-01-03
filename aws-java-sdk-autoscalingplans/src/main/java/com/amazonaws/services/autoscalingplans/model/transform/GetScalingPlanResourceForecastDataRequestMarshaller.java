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
package com.amazonaws.services.autoscalingplans.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.autoscalingplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetScalingPlanResourceForecastDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetScalingPlanResourceForecastDataRequestMarshaller {

    private static final MarshallingInfo<String> SCALINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanName").build();
    private static final MarshallingInfo<Long> SCALINGPLANVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanVersion").build();
    private static final MarshallingInfo<String> SERVICENAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNamespace").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> SCALABLEDIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalableDimension").build();
    private static final MarshallingInfo<String> FORECASTDATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastDataType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();

    private static final GetScalingPlanResourceForecastDataRequestMarshaller instance = new GetScalingPlanResourceForecastDataRequestMarshaller();

    public static GetScalingPlanResourceForecastDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetScalingPlanResourceForecastDataRequest getScalingPlanResourceForecastDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (getScalingPlanResourceForecastDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getScalingPlanName(), SCALINGPLANNAME_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getScalingPlanVersion(), SCALINGPLANVERSION_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getServiceNamespace(), SERVICENAMESPACE_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getScalableDimension(), SCALABLEDIMENSION_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getForecastDataType(), FORECASTDATATYPE_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getScalingPlanResourceForecastDataRequest.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
