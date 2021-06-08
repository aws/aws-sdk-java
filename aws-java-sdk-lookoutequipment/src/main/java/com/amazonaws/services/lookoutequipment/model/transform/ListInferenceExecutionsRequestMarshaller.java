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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListInferenceExecutionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListInferenceExecutionsRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerName").build();
    private static final MarshallingInfo<java.util.Date> DATASTARTTIMEAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataStartTimeAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATAENDTIMEBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataEndTimeBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final ListInferenceExecutionsRequestMarshaller instance = new ListInferenceExecutionsRequestMarshaller();

    public static ListInferenceExecutionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListInferenceExecutionsRequest listInferenceExecutionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listInferenceExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getInferenceSchedulerName(), INFERENCESCHEDULERNAME_BINDING);
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getDataStartTimeAfter(), DATASTARTTIMEAFTER_BINDING);
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getDataEndTimeBefore(), DATAENDTIMEBEFORE_BINDING);
            protocolMarshaller.marshall(listInferenceExecutionsRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
