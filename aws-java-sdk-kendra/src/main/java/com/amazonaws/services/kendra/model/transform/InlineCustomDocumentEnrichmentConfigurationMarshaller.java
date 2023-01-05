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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InlineCustomDocumentEnrichmentConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InlineCustomDocumentEnrichmentConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Condition").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Target").build();
    private static final MarshallingInfo<Boolean> DOCUMENTCONTENTDELETION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentContentDeletion").build();

    private static final InlineCustomDocumentEnrichmentConfigurationMarshaller instance = new InlineCustomDocumentEnrichmentConfigurationMarshaller();

    public static InlineCustomDocumentEnrichmentConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InlineCustomDocumentEnrichmentConfiguration inlineCustomDocumentEnrichmentConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (inlineCustomDocumentEnrichmentConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inlineCustomDocumentEnrichmentConfiguration.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(inlineCustomDocumentEnrichmentConfiguration.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(inlineCustomDocumentEnrichmentConfiguration.getDocumentContentDeletion(), DOCUMENTCONTENTDELETION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
