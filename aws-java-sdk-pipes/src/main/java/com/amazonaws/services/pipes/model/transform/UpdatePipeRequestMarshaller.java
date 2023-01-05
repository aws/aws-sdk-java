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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePipeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePipeRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DESIREDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredState").build();
    private static final MarshallingInfo<String> ENRICHMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Enrichment").build();
    private static final MarshallingInfo<StructuredPojo> ENRICHMENTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnrichmentParameters").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceParameters").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Target").build();
    private static final MarshallingInfo<StructuredPojo> TARGETPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetParameters").build();

    private static final UpdatePipeRequestMarshaller instance = new UpdatePipeRequestMarshaller();

    public static UpdatePipeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePipeRequest updatePipeRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePipeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePipeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getDesiredState(), DESIREDSTATE_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getEnrichment(), ENRICHMENT_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getEnrichmentParameters(), ENRICHMENTPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getSourceParameters(), SOURCEPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(updatePipeRequest.getTargetParameters(), TARGETPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
