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
 * EntityTypeFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityTypeFiltersMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATAPRODUCTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataProductFilters").build();
    private static final MarshallingInfo<StructuredPojo> SAASPRODUCTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaaSProductFilters").build();
    private static final MarshallingInfo<StructuredPojo> AMIPRODUCTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmiProductFilters").build();
    private static final MarshallingInfo<StructuredPojo> OFFERFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferFilters").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERPRODUCTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerProductFilters").build();
    private static final MarshallingInfo<StructuredPojo> RESALEAUTHORIZATIONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResaleAuthorizationFilters").build();

    private static final EntityTypeFiltersMarshaller instance = new EntityTypeFiltersMarshaller();

    public static EntityTypeFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityTypeFilters entityTypeFilters, ProtocolMarshaller protocolMarshaller) {

        if (entityTypeFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityTypeFilters.getDataProductFilters(), DATAPRODUCTFILTERS_BINDING);
            protocolMarshaller.marshall(entityTypeFilters.getSaaSProductFilters(), SAASPRODUCTFILTERS_BINDING);
            protocolMarshaller.marshall(entityTypeFilters.getAmiProductFilters(), AMIPRODUCTFILTERS_BINDING);
            protocolMarshaller.marshall(entityTypeFilters.getOfferFilters(), OFFERFILTERS_BINDING);
            protocolMarshaller.marshall(entityTypeFilters.getContainerProductFilters(), CONTAINERPRODUCTFILTERS_BINDING);
            protocolMarshaller.marshall(entityTypeFilters.getResaleAuthorizationFilters(), RESALEAUTHORIZATIONFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
