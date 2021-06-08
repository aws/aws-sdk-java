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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociationSummaryMarshaller {

    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<String> DESTINATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationType").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationType").build();
    private static final MarshallingInfo<String> SOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceName").build();
    private static final MarshallingInfo<String> DESTINATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();

    private static final AssociationSummaryMarshaller instance = new AssociationSummaryMarshaller();

    public static AssociationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociationSummary associationSummary, ProtocolMarshaller protocolMarshaller) {

        if (associationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associationSummary.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(associationSummary.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(associationSummary.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(associationSummary.getDestinationType(), DESTINATIONTYPE_BINDING);
            protocolMarshaller.marshall(associationSummary.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(associationSummary.getSourceName(), SOURCENAME_BINDING);
            protocolMarshaller.marshall(associationSummary.getDestinationName(), DESTINATIONNAME_BINDING);
            protocolMarshaller.marshall(associationSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(associationSummary.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
