/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CountsSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CountsSummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> COMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("components").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTTEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentTemplates").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environments").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelines").build();
    private static final MarshallingInfo<StructuredPojo> SERVICEINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceInstances").build();
    private static final MarshallingInfo<StructuredPojo> SERVICETEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceTemplates").build();
    private static final MarshallingInfo<StructuredPojo> SERVICES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("services").build();

    private static final CountsSummaryMarshaller instance = new CountsSummaryMarshaller();

    public static CountsSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CountsSummary countsSummary, ProtocolMarshaller protocolMarshaller) {

        if (countsSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(countsSummary.getComponents(), COMPONENTS_BINDING);
            protocolMarshaller.marshall(countsSummary.getEnvironmentTemplates(), ENVIRONMENTTEMPLATES_BINDING);
            protocolMarshaller.marshall(countsSummary.getEnvironments(), ENVIRONMENTS_BINDING);
            protocolMarshaller.marshall(countsSummary.getPipelines(), PIPELINES_BINDING);
            protocolMarshaller.marshall(countsSummary.getServiceInstances(), SERVICEINSTANCES_BINDING);
            protocolMarshaller.marshall(countsSummary.getServiceTemplates(), SERVICETEMPLATES_BINDING);
            protocolMarshaller.marshall(countsSummary.getServices(), SERVICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
