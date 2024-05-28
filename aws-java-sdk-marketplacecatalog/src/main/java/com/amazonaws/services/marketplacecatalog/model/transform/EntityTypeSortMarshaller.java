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
 * EntityTypeSortMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityTypeSortMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATAPRODUCTSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataProductSort").build();
    private static final MarshallingInfo<StructuredPojo> SAASPRODUCTSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaaSProductSort").build();
    private static final MarshallingInfo<StructuredPojo> AMIPRODUCTSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmiProductSort").build();
    private static final MarshallingInfo<StructuredPojo> OFFERSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferSort").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERPRODUCTSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerProductSort").build();
    private static final MarshallingInfo<StructuredPojo> RESALEAUTHORIZATIONSORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResaleAuthorizationSort").build();

    private static final EntityTypeSortMarshaller instance = new EntityTypeSortMarshaller();

    public static EntityTypeSortMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityTypeSort entityTypeSort, ProtocolMarshaller protocolMarshaller) {

        if (entityTypeSort == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityTypeSort.getDataProductSort(), DATAPRODUCTSORT_BINDING);
            protocolMarshaller.marshall(entityTypeSort.getSaaSProductSort(), SAASPRODUCTSORT_BINDING);
            protocolMarshaller.marshall(entityTypeSort.getAmiProductSort(), AMIPRODUCTSORT_BINDING);
            protocolMarshaller.marshall(entityTypeSort.getOfferSort(), OFFERSORT_BINDING);
            protocolMarshaller.marshall(entityTypeSort.getContainerProductSort(), CONTAINERPRODUCTSORT_BINDING);
            protocolMarshaller.marshall(entityTypeSort.getResaleAuthorizationSort(), RESALEAUTHORIZATIONSORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
