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
 * CreateSecurityProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSecurityProfileRequestMarshaller {

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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateSecurityProfileRequestMarshaller instance = new CreateSecurityProfileRequestMarshaller();

    public static CreateSecurityProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSecurityProfileRequest createSecurityProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSecurityProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSecurityProfileRequest.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getSecurityProfileDescription(), SECURITYPROFILEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getBehaviors(), BEHAVIORS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getAlertTargets(), ALERTTARGETS_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getAdditionalMetricsToRetain(), ADDITIONALMETRICSTORETAIN_BINDING);
            protocolMarshaller.marshall(createSecurityProfileRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
