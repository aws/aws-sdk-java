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
package com.amazonaws.services.dlm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PolicyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PolicyDetailsMarshaller {

    private static final MarshallingInfo<String> POLICYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyType").build();
    private static final MarshallingInfo<List> RESOURCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceTypes").build();
    private static final MarshallingInfo<List> RESOURCELOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceLocations").build();
    private static final MarshallingInfo<List> TARGETTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetTags").build();
    private static final MarshallingInfo<List> SCHEDULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Schedules").build();
    private static final MarshallingInfo<StructuredPojo> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Parameters").build();
    private static final MarshallingInfo<StructuredPojo> EVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSource").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Actions").build();
    private static final MarshallingInfo<String> POLICYLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyLanguage").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<Integer> CREATEINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateInterval").build();
    private static final MarshallingInfo<Integer> RETAININTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetainInterval").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTags").build();
    private static final MarshallingInfo<List> CROSSREGIONCOPYTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossRegionCopyTargets").build();
    private static final MarshallingInfo<Boolean> EXTENDDELETION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendDeletion").build();
    private static final MarshallingInfo<StructuredPojo> EXCLUSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Exclusions").build();

    private static final PolicyDetailsMarshaller instance = new PolicyDetailsMarshaller();

    public static PolicyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PolicyDetails policyDetails, ProtocolMarshaller protocolMarshaller) {

        if (policyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(policyDetails.getPolicyType(), POLICYTYPE_BINDING);
            protocolMarshaller.marshall(policyDetails.getResourceTypes(), RESOURCETYPES_BINDING);
            protocolMarshaller.marshall(policyDetails.getResourceLocations(), RESOURCELOCATIONS_BINDING);
            protocolMarshaller.marshall(policyDetails.getTargetTags(), TARGETTAGS_BINDING);
            protocolMarshaller.marshall(policyDetails.getSchedules(), SCHEDULES_BINDING);
            protocolMarshaller.marshall(policyDetails.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(policyDetails.getEventSource(), EVENTSOURCE_BINDING);
            protocolMarshaller.marshall(policyDetails.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(policyDetails.getPolicyLanguage(), POLICYLANGUAGE_BINDING);
            protocolMarshaller.marshall(policyDetails.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(policyDetails.getCreateInterval(), CREATEINTERVAL_BINDING);
            protocolMarshaller.marshall(policyDetails.getRetainInterval(), RETAININTERVAL_BINDING);
            protocolMarshaller.marshall(policyDetails.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(policyDetails.getCrossRegionCopyTargets(), CROSSREGIONCOPYTARGETS_BINDING);
            protocolMarshaller.marshall(policyDetails.getExtendDeletion(), EXTENDDELETION_BINDING);
            protocolMarshaller.marshall(policyDetails.getExclusions(), EXCLUSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
