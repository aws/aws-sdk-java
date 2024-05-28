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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StandardsControlAssociationDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StandardsControlAssociationDetailMarshaller {

    private static final MarshallingInfo<String> STANDARDSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsArn").build();
    private static final MarshallingInfo<String> SECURITYCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlId").build();
    private static final MarshallingInfo<String> SECURITYCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityControlArn").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationStatus").build();
    private static final MarshallingInfo<List> RELATEDREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedRequirements").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedReason").build();
    private static final MarshallingInfo<String> STANDARDSCONTROLTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsControlTitle").build();
    private static final MarshallingInfo<String> STANDARDSCONTROLDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsControlDescription").build();
    private static final MarshallingInfo<List> STANDARDSCONTROLARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsControlArns").build();

    private static final StandardsControlAssociationDetailMarshaller instance = new StandardsControlAssociationDetailMarshaller();

    public static StandardsControlAssociationDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StandardsControlAssociationDetail standardsControlAssociationDetail, ProtocolMarshaller protocolMarshaller) {

        if (standardsControlAssociationDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(standardsControlAssociationDetail.getStandardsArn(), STANDARDSARN_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getSecurityControlId(), SECURITYCONTROLID_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getSecurityControlArn(), SECURITYCONTROLARN_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getAssociationStatus(), ASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getRelatedRequirements(), RELATEDREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getUpdatedReason(), UPDATEDREASON_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getStandardsControlTitle(), STANDARDSCONTROLTITLE_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getStandardsControlDescription(), STANDARDSCONTROLDESCRIPTION_BINDING);
            protocolMarshaller.marshall(standardsControlAssociationDetail.getStandardsControlArns(), STANDARDSCONTROLARNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
