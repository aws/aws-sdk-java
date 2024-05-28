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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchCriteriaMarshaller {

    private static final MarshallingInfo<List> AGENTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentIds").build();
    private static final MarshallingInfo<StructuredPojo> AGENTHIERARCHYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentHierarchyGroups").build();
    private static final MarshallingInfo<List> CHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channels").build();
    private static final MarshallingInfo<StructuredPojo> CONTACTANALYSIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactAnalysis").build();
    private static final MarshallingInfo<List> INITIATIONMETHODS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitiationMethods").build();
    private static final MarshallingInfo<List> QUEUEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueIds").build();
    private static final MarshallingInfo<StructuredPojo> SEARCHABLECONTACTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SearchableContactAttributes").build();

    private static final SearchCriteriaMarshaller instance = new SearchCriteriaMarshaller();

    public static SearchCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchCriteria searchCriteria, ProtocolMarshaller protocolMarshaller) {

        if (searchCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchCriteria.getAgentIds(), AGENTIDS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getAgentHierarchyGroups(), AGENTHIERARCHYGROUPS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getChannels(), CHANNELS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getContactAnalysis(), CONTACTANALYSIS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getInitiationMethods(), INITIATIONMETHODS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getQueueIds(), QUEUEIDS_BINDING);
            protocolMarshaller.marshall(searchCriteria.getSearchableContactAttributes(), SEARCHABLECONTACTATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
