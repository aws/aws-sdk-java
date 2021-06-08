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
package com.amazonaws.services.ssmincidents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmincidents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IncidentTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IncidentTemplateMarshaller {

    private static final MarshallingInfo<String> DEDUPESTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dedupeString").build();
    private static final MarshallingInfo<Integer> IMPACT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("impact").build();
    private static final MarshallingInfo<List> NOTIFICATIONTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationTargets").build();
    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("summary").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();

    private static final IncidentTemplateMarshaller instance = new IncidentTemplateMarshaller();

    public static IncidentTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IncidentTemplate incidentTemplate, ProtocolMarshaller protocolMarshaller) {

        if (incidentTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(incidentTemplate.getDedupeString(), DEDUPESTRING_BINDING);
            protocolMarshaller.marshall(incidentTemplate.getImpact(), IMPACT_BINDING);
            protocolMarshaller.marshall(incidentTemplate.getNotificationTargets(), NOTIFICATIONTARGETS_BINDING);
            protocolMarshaller.marshall(incidentTemplate.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(incidentTemplate.getTitle(), TITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
