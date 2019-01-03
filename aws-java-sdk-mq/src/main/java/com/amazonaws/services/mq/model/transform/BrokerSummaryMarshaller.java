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
package com.amazonaws.services.mq.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BrokerSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BrokerSummaryMarshaller {

    private static final MarshallingInfo<String> BROKERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("brokerArn").build();
    private static final MarshallingInfo<String> BROKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("brokerId").build();
    private static final MarshallingInfo<String> BROKERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerName").build();
    private static final MarshallingInfo<String> BROKERSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brokerState").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DEPLOYMENTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentMode").build();
    private static final MarshallingInfo<String> HOSTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostInstanceType").build();

    private static final BrokerSummaryMarshaller instance = new BrokerSummaryMarshaller();

    public static BrokerSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BrokerSummary brokerSummary, ProtocolMarshaller protocolMarshaller) {

        if (brokerSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(brokerSummary.getBrokerArn(), BROKERARN_BINDING);
            protocolMarshaller.marshall(brokerSummary.getBrokerId(), BROKERID_BINDING);
            protocolMarshaller.marshall(brokerSummary.getBrokerName(), BROKERNAME_BINDING);
            protocolMarshaller.marshall(brokerSummary.getBrokerState(), BROKERSTATE_BINDING);
            protocolMarshaller.marshall(brokerSummary.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(brokerSummary.getDeploymentMode(), DEPLOYMENTMODE_BINDING);
            protocolMarshaller.marshall(brokerSummary.getHostInstanceType(), HOSTINSTANCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
