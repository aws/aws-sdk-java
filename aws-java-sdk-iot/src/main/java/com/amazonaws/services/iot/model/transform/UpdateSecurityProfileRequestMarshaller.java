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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSecurityProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSecurityProfileRequestMarshaller {

    private static final MarshallingInfo<String> SECURITYPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("securityProfileName").build();
    private static final MarshallingInfo<String> SECURITYPROFILEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityProfileDescription").build();
    private static final MarshallingInfo<List> BEHAVIORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("behaviors").build();
    private static final MarshallingInfo<Map> ALERTTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alertTargets").build();
    private static final MarshallingInfo<List> ADDITIONALMETRICSTORETAIN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalMetricsToRetain").build();
    private static final MarshallingInfo<Boolean> DELETEBEHAVIORS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deleteBehaviors").build();
    private static final MarshallingInfo<Boolean> DELETEALERTTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deleteAlertTargets").build();
    private static final MarshallingInfo<Boolean> DELETEADDITIONALMETRICSTORETAIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deleteAdditionalMetricsToRetain").build();
    private static final MarshallingInfo<Long> EXPECTEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("expectedVersion").build();

    private static final UpdateSecurityProfileRequestMarshaller instance = new UpdateSecurityProfileRequestMarshaller();

    public static UpdateSecurityProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSecurityProfileRequest updateSecurityProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSecurityProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSecurityProfileRequest.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getSecurityProfileDescription(), SECURITYPROFILEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getBehaviors(), BEHAVIORS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getAlertTargets(), ALERTTARGETS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getAdditionalMetricsToRetain(), ADDITIONALMETRICSTORETAIN_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getDeleteBehaviors(), DELETEBEHAVIORS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getDeleteAlertTargets(), DELETEALERTTARGETS_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getDeleteAdditionalMetricsToRetain(), DELETEADDITIONALMETRICSTORETAIN_BINDING);
            protocolMarshaller.marshall(updateSecurityProfileRequest.getExpectedVersion(), EXPECTEDVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
