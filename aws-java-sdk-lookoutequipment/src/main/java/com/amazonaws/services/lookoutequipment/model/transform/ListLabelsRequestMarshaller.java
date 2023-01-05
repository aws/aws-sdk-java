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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListLabelsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListLabelsRequestMarshaller {

    private static final MarshallingInfo<String> LABELGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelGroupName").build();
    private static final MarshallingInfo<java.util.Date> INTERVALSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntervalStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> INTERVALENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntervalEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAULTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FaultCode").build();
    private static final MarshallingInfo<String> EQUIPMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Equipment").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final ListLabelsRequestMarshaller instance = new ListLabelsRequestMarshaller();

    public static ListLabelsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListLabelsRequest listLabelsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listLabelsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listLabelsRequest.getLabelGroupName(), LABELGROUPNAME_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getIntervalStartTime(), INTERVALSTARTTIME_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getIntervalEndTime(), INTERVALENDTIME_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getFaultCode(), FAULTCODE_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getEquipment(), EQUIPMENT_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listLabelsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
