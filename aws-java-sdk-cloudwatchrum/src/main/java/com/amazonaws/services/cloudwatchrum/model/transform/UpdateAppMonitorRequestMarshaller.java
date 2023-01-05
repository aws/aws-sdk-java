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
package com.amazonaws.services.cloudwatchrum.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAppMonitorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAppMonitorRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> APPMONITORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppMonitorConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomEvents").build();
    private static final MarshallingInfo<Boolean> CWLOGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CwLogEnabled").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Name").build();

    private static final UpdateAppMonitorRequestMarshaller instance = new UpdateAppMonitorRequestMarshaller();

    public static UpdateAppMonitorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAppMonitorRequest updateAppMonitorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAppMonitorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAppMonitorRequest.getAppMonitorConfiguration(), APPMONITORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateAppMonitorRequest.getCustomEvents(), CUSTOMEVENTS_BINDING);
            protocolMarshaller.marshall(updateAppMonitorRequest.getCwLogEnabled(), CWLOGENABLED_BINDING);
            protocolMarshaller.marshall(updateAppMonitorRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(updateAppMonitorRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
