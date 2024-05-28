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
 * SourceApiAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceApiAssociationMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationId").build();
    private static final MarshallingInfo<String> ASSOCIATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationArn").build();
    private static final MarshallingInfo<String> SOURCEAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiId").build();
    private static final MarshallingInfo<String> SOURCEAPIARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiArn").build();
    private static final MarshallingInfo<String> MERGEDAPIARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiArn").build();
    private static final MarshallingInfo<String> MERGEDAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mergedApiId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEAPIASSOCIATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiAssociationConfig").build();
    private static final MarshallingInfo<String> SOURCEAPIASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiAssociationStatus").build();
    private static final MarshallingInfo<String> SOURCEAPIASSOCIATIONSTATUSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceApiAssociationStatusDetail").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULMERGEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSuccessfulMergeDate").timestampFormat("unixTimestamp").build();

    private static final SourceApiAssociationMarshaller instance = new SourceApiAssociationMarshaller();

    public static SourceApiAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceApiAssociation sourceApiAssociation, ProtocolMarshaller protocolMarshaller) {

        if (sourceApiAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceApiAssociation.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getAssociationArn(), ASSOCIATIONARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getSourceApiId(), SOURCEAPIID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getSourceApiArn(), SOURCEAPIARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getMergedApiArn(), MERGEDAPIARN_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getMergedApiId(), MERGEDAPIID_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getSourceApiAssociationConfig(), SOURCEAPIASSOCIATIONCONFIG_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getSourceApiAssociationStatus(), SOURCEAPIASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getSourceApiAssociationStatusDetail(), SOURCEAPIASSOCIATIONSTATUSDETAIL_BINDING);
            protocolMarshaller.marshall(sourceApiAssociation.getLastSuccessfulMergeDate(), LASTSUCCESSFULMERGEDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
