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
package com.amazonaws.services.connectwisdom.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectwisdom.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssistantAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssistantAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> ASSISTANTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assistantArn").build();
    private static final MarshallingInfo<String> ASSISTANTASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assistantAssociationArn").build();
    private static final MarshallingInfo<String> ASSISTANTASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assistantAssociationId").build();
    private static final MarshallingInfo<String> ASSISTANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assistantId").build();
    private static final MarshallingInfo<StructuredPojo> ASSOCIATIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationData").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationType").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final AssistantAssociationSummaryMarshaller instance = new AssistantAssociationSummaryMarshaller();

    public static AssistantAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssistantAssociationSummary assistantAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (assistantAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assistantAssociationSummary.getAssistantArn(), ASSISTANTARN_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getAssistantAssociationArn(), ASSISTANTASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getAssistantAssociationId(), ASSISTANTASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getAssistantId(), ASSISTANTID_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getAssociationData(), ASSOCIATIONDATA_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(assistantAssociationSummary.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
