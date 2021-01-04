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
package com.amazonaws.services.auditmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentControlSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentControlSetMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> ROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roles").build();
    private static final MarshallingInfo<List> CONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("controls").build();
    private static final MarshallingInfo<List> DELEGATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("delegations").build();
    private static final MarshallingInfo<Integer> SYSTEMEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemEvidenceCount").build();
    private static final MarshallingInfo<Integer> MANUALEVIDENCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manualEvidenceCount").build();

    private static final AssessmentControlSetMarshaller instance = new AssessmentControlSetMarshaller();

    public static AssessmentControlSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentControlSet assessmentControlSet, ProtocolMarshaller protocolMarshaller) {

        if (assessmentControlSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentControlSet.getId(), ID_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getRoles(), ROLES_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getControls(), CONTROLS_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getDelegations(), DELEGATIONS_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getSystemEvidenceCount(), SYSTEMEVIDENCECOUNT_BINDING);
            protocolMarshaller.marshall(assessmentControlSet.getManualEvidenceCount(), MANUALEVIDENCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
