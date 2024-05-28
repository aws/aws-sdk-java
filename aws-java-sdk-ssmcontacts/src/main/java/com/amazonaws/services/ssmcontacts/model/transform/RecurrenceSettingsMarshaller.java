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
package com.amazonaws.services.ssmcontacts.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmcontacts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecurrenceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecurrenceSettingsMarshaller {

    private static final MarshallingInfo<List> MONTHLYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonthlySettings").build();
    private static final MarshallingInfo<List> WEEKLYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklySettings").build();
    private static final MarshallingInfo<List> DAILYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DailySettings").build();
    private static final MarshallingInfo<Integer> NUMBEROFONCALLS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfOnCalls").build();
    private static final MarshallingInfo<Map> SHIFTCOVERAGES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ShiftCoverages").build();
    private static final MarshallingInfo<Integer> RECURRENCEMULTIPLIER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecurrenceMultiplier").build();

    private static final RecurrenceSettingsMarshaller instance = new RecurrenceSettingsMarshaller();

    public static RecurrenceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecurrenceSettings recurrenceSettings, ProtocolMarshaller protocolMarshaller) {

        if (recurrenceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recurrenceSettings.getMonthlySettings(), MONTHLYSETTINGS_BINDING);
            protocolMarshaller.marshall(recurrenceSettings.getWeeklySettings(), WEEKLYSETTINGS_BINDING);
            protocolMarshaller.marshall(recurrenceSettings.getDailySettings(), DAILYSETTINGS_BINDING);
            protocolMarshaller.marshall(recurrenceSettings.getNumberOfOnCalls(), NUMBEROFONCALLS_BINDING);
            protocolMarshaller.marshall(recurrenceSettings.getShiftCoverages(), SHIFTCOVERAGES_BINDING);
            protocolMarshaller.marshall(recurrenceSettings.getRecurrenceMultiplier(), RECURRENCEMULTIPLIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
