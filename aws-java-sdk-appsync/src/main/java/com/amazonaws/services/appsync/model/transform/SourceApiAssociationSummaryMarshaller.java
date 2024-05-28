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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceApiAssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceApiAssociationSummaryMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationId").build();
    private static final MarshallingInfo<String> ASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationArn").build();
    private static final MarshallingInfo<String> SOURCEAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiId").build();
    private static final MarshallingInfo<String> SOURCEAPIARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiArn").build();
    private static final MarshallingInfo<String> MERGEDAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiId").build();
    private static final MarshallingInfo<String> MERGEDAPIARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();

    private static final SourceApiAssociationSummaryMarshaller instance = new SourceApiAssociationSummaryMarshaller();

    public static SourceApiAssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceApiAssociationSummary sourceApiAssociationSummary, ProtocolMarshaller protocolMarshaller) {

        if (sourceApiAssociationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceApiAssociationSummary.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getAssociationArn(), ASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getSourceApiId(), SOURCEAPIID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getSourceApiArn(), SOURCEAPIARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getMergedApiId(), MERGEDAPIID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getMergedApiArn(), MERGEDAPIARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociationSummary.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
