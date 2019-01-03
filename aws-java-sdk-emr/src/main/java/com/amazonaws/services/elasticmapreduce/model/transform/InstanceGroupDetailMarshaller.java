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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceGroupDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceGroupDetailMarshaller {

    private static final MarshallingInfo<String> INSTANCEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> MARKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Market").build();
    private static final MarshallingInfo<String> INSTANCEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRole").build();
    private static final MarshallingInfo<String> BIDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BidPrice").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Integer> INSTANCEREQUESTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRequestCount").build();
    private static final MarshallingInfo<Integer> INSTANCERUNNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRunningCount").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> LASTSTATECHANGEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStateChangeReason").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> READYDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadyDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndDateTime").timestampFormat("unixTimestamp").build();

    private static final InstanceGroupDetailMarshaller instance = new InstanceGroupDetailMarshaller();

    public static InstanceGroupDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceGroupDetail instanceGroupDetail, ProtocolMarshaller protocolMarshaller) {

        if (instanceGroupDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceGroupDetail.getInstanceGroupId(), INSTANCEGROUPID_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getMarket(), MARKET_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getInstanceRole(), INSTANCEROLE_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getBidPrice(), BIDPRICE_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getInstanceRequestCount(), INSTANCEREQUESTCOUNT_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getInstanceRunningCount(), INSTANCERUNNINGCOUNT_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getState(), STATE_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getLastStateChangeReason(), LASTSTATECHANGEREASON_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getStartDateTime(), STARTDATETIME_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getReadyDateTime(), READYDATETIME_BINDING);
            protocolMarshaller.marshall(instanceGroupDetail.getEndDateTime(), ENDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
