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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ViolationEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ViolationEventMarshaller {

    private static final MarshallingInfo<String> VIOLATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationId").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<String> SECURITYPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityProfileName").build();
    private static final MarshallingInfo<StructuredPojo> BEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("behavior").build();
    private static final MarshallingInfo<StructuredPojo> METRICVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricValue").build();
    private static final MarshallingInfo<String> VIOLATIONEVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationEventType").build();
    private static final MarshallingInfo<java.util.Date> VIOLATIONEVENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationEventTime").timestampFormat("unixTimestamp").build();

    private static final ViolationEventMarshaller instance = new ViolationEventMarshaller();

    public static ViolationEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ViolationEvent violationEvent, ProtocolMarshaller protocolMarshaller) {

        if (violationEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(violationEvent.getViolationId(), VIOLATIONID_BINDING);
            protocolMarshaller.marshall(violationEvent.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(violationEvent.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(violationEvent.getBehavior(), BEHAVIOR_BINDING);
            protocolMarshaller.marshall(violationEvent.getMetricValue(), METRICVALUE_BINDING);
            protocolMarshaller.marshall(violationEvent.getViolationEventType(), VIOLATIONEVENTTYPE_BINDING);
            protocolMarshaller.marshall(violationEvent.getViolationEventTime(), VIOLATIONEVENTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
