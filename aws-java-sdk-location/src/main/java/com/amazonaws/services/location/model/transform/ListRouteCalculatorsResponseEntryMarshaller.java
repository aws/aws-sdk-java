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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRouteCalculatorsResponseEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRouteCalculatorsResponseEntryMarshaller {

    private static final MarshallingInfo<String> CALCULATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatorName").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> PRICINGPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PricingPlan").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTime").timestampFormat("iso8601").build();

    private static final ListRouteCalculatorsResponseEntryMarshaller instance = new ListRouteCalculatorsResponseEntryMarshaller();

    public static ListRouteCalculatorsResponseEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRouteCalculatorsResponseEntry listRouteCalculatorsResponseEntry, ProtocolMarshaller protocolMarshaller) {

        if (listRouteCalculatorsResponseEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getCalculatorName(), CALCULATORNAME_BINDING);
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getPricingPlan(), PRICINGPLAN_BINDING);
            protocolMarshaller.marshall(listRouteCalculatorsResponseEntry.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
