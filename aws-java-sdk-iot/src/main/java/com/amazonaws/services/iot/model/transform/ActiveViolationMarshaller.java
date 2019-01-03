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
 * ActiveViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActiveViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationId").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<String> SECURITYPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityProfileName").build();
    private static final MarshallingInfo<StructuredPojo> BEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("behavior").build();
    private static final MarshallingInfo<StructuredPojo> LASTVIOLATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastViolationValue").build();
    private static final MarshallingInfo<java.util.Date> LASTVIOLATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastViolationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> VIOLATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationStartTime").timestampFormat("unixTimestamp").build();

    private static final ActiveViolationMarshaller instance = new ActiveViolationMarshaller();

    public static ActiveViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActiveViolation activeViolation, ProtocolMarshaller protocolMarshaller) {

        if (activeViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activeViolation.getViolationId(), VIOLATIONID_BINDING);
            protocolMarshaller.marshall(activeViolation.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(activeViolation.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(activeViolation.getBehavior(), BEHAVIOR_BINDING);
            protocolMarshaller.marshall(activeViolation.getLastViolationValue(), LASTVIOLATIONVALUE_BINDING);
            protocolMarshaller.marshall(activeViolation.getLastViolationTime(), LASTVIOLATIONTIME_BINDING);
            protocolMarshaller.marshall(activeViolation.getViolationStartTime(), VIOLATIONSTARTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
