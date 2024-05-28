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
package com.amazonaws.services.marketplacecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntitySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntitySummaryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityType").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityId").build();
    private static final MarshallingInfo<String> ENTITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityArn").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<StructuredPojo> AMIPRODUCTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmiProductSummary").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERPRODUCTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerProductSummary").build();
    private static final MarshallingInfo<StructuredPojo> DATAPRODUCTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataProductSummary").build();
    private static final MarshallingInfo<StructuredPojo> SAASPRODUCTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaaSProductSummary").build();
    private static final MarshallingInfo<StructuredPojo> OFFERSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferSummary").build();
    private static final MarshallingInfo<StructuredPojo> RESALEAUTHORIZATIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResaleAuthorizationSummary").build();

    private static final EntitySummaryMarshaller instance = new EntitySummaryMarshaller();

    public static EntitySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntitySummary entitySummary, ProtocolMarshaller protocolMarshaller) {

        if (entitySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entitySummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(entitySummary.getEntityType(), ENTITYTYPE_BINDING);
            protocolMarshaller.marshall(entitySummary.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(entitySummary.getEntityArn(), ENTITYARN_BINDING);
            protocolMarshaller.marshall(entitySummary.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(entitySummary.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(entitySummary.getAmiProductSummary(), AMIPRODUCTSUMMARY_BINDING);
            protocolMarshaller.marshall(entitySummary.getContainerProductSummary(), CONTAINERPRODUCTSUMMARY_BINDING);
            protocolMarshaller.marshall(entitySummary.getDataProductSummary(), DATAPRODUCTSUMMARY_BINDING);
            protocolMarshaller.marshall(entitySummary.getSaaSProductSummary(), SAASPRODUCTSUMMARY_BINDING);
            protocolMarshaller.marshall(entitySummary.getOfferSummary(), OFFERSUMMARY_BINDING);
            protocolMarshaller.marshall(entitySummary.getResaleAuthorizationSummary(), RESALEAUTHORIZATIONSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
