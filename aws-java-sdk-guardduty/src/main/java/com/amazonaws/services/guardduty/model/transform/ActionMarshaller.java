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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionMarshaller {

    private static final MarshallingInfo<String> ACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionType").build();
    private static final MarshallingInfo<StructuredPojo> AWSAPICALLACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsApiCallAction").build();
    private static final MarshallingInfo<StructuredPojo> DNSREQUESTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dnsRequestAction").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONNECTIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConnectionAction").build();
    private static final MarshallingInfo<StructuredPojo> PORTPROBEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portProbeAction").build();

    private static final ActionMarshaller instance = new ActionMarshaller();

    public static ActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Action action, ProtocolMarshaller protocolMarshaller) {

        if (action == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(action.getActionType(), ACTIONTYPE_BINDING);
            protocolMarshaller.marshall(action.getAwsApiCallAction(), AWSAPICALLACTION_BINDING);
            protocolMarshaller.marshall(action.getDnsRequestAction(), DNSREQUESTACTION_BINDING);
            protocolMarshaller.marshall(action.getNetworkConnectionAction(), NETWORKCONNECTIONACTION_BINDING);
            protocolMarshaller.marshall(action.getPortProbeAction(), PORTPROBEACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
