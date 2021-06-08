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
 * ListMapsResponseEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListMapsResponseEntryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> MAPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MapName").build();
    private static final MarshallingInfo<String> PRICINGPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PricingPlan").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTime").timestampFormat("iso8601").build();

    private static final ListMapsResponseEntryMarshaller instance = new ListMapsResponseEntryMarshaller();

    public static ListMapsResponseEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListMapsResponseEntry listMapsResponseEntry, ProtocolMarshaller protocolMarshaller) {

        if (listMapsResponseEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listMapsResponseEntry.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(listMapsResponseEntry.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(listMapsResponseEntry.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(listMapsResponseEntry.getMapName(), MAPNAME_BINDING);
            protocolMarshaller.marshall(listMapsResponseEntry.getPricingPlan(), PRICINGPLAN_BINDING);
            protocolMarshaller.marshall(listMapsResponseEntry.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
