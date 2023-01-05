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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlDomainInsightsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlDomainInsightsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Integer> CONTROLSCOUNTBYNONCOMPLIANTEVIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlsCountByNoncompliantEvidence").build();
    private static final MarshallingInfo<Integer> TOTALCONTROLSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalControlsCount").build();
    private static final MarshallingInfo<StructuredPojo> EVIDENCEINSIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evidenceInsights").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("unixTimestamp").build();

    private static final ControlDomainInsightsMarshaller instance = new ControlDomainInsightsMarshaller();

    public static ControlDomainInsightsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlDomainInsights controlDomainInsights, ProtocolMarshaller protocolMarshaller) {

        if (controlDomainInsights == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlDomainInsights.getName(), NAME_BINDING);
            protocolMarshaller.marshall(controlDomainInsights.getId(), ID_BINDING);
            protocolMarshaller.marshall(controlDomainInsights.getControlsCountByNoncompliantEvidence(), CONTROLSCOUNTBYNONCOMPLIANTEVIDENCE_BINDING);
            protocolMarshaller.marshall(controlDomainInsights.getTotalControlsCount(), TOTALCONTROLSCOUNT_BINDING);
            protocolMarshaller.marshall(controlDomainInsights.getEvidenceInsights(), EVIDENCEINSIGHTS_BINDING);
            protocolMarshaller.marshall(controlDomainInsights.getLastUpdated(), LASTUPDATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
