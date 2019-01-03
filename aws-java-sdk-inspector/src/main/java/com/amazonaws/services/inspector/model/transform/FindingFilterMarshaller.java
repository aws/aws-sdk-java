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
package com.amazonaws.services.inspector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingFilterMarshaller {

    private static final MarshallingInfo<List> AGENTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("agentIds").build();
    private static final MarshallingInfo<List> AUTOSCALINGGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroups").build();
    private static final MarshallingInfo<List> RULENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ruleNames").build();
    private static final MarshallingInfo<List> SEVERITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severities").build();
    private static final MarshallingInfo<List> RULESPACKAGEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rulesPackageArns").build();
    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<List> USERATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CREATIONTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTimeRange").build();

    private static final FindingFilterMarshaller instance = new FindingFilterMarshaller();

    public static FindingFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingFilter findingFilter, ProtocolMarshaller protocolMarshaller) {

        if (findingFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingFilter.getAgentIds(), AGENTIDS_BINDING);
            protocolMarshaller.marshall(findingFilter.getAutoScalingGroups(), AUTOSCALINGGROUPS_BINDING);
            protocolMarshaller.marshall(findingFilter.getRuleNames(), RULENAMES_BINDING);
            protocolMarshaller.marshall(findingFilter.getSeverities(), SEVERITIES_BINDING);
            protocolMarshaller.marshall(findingFilter.getRulesPackageArns(), RULESPACKAGEARNS_BINDING);
            protocolMarshaller.marshall(findingFilter.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(findingFilter.getUserAttributes(), USERATTRIBUTES_BINDING);
            protocolMarshaller.marshall(findingFilter.getCreationTimeRange(), CREATIONTIMERANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
