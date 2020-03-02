/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ProductMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductMarshaller {

    private static final MarshallingInfo<String> PRODUCTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductArn").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<String> COMPANYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompanyName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> CATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Categories").build();
    private static final MarshallingInfo<List> INTEGRATIONTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegrationTypes").build();
    private static final MarshallingInfo<String> MARKETPLACEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarketplaceUrl").build();
    private static final MarshallingInfo<String> ACTIVATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivationUrl").build();
    private static final MarshallingInfo<String> PRODUCTSUBSCRIPTIONRESOURCEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductSubscriptionResourcePolicy").build();

    private static final ProductMarshaller instance = new ProductMarshaller();

    public static ProductMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Product product, ProtocolMarshaller protocolMarshaller) {

        if (product == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(product.getProductArn(), PRODUCTARN_BINDING);
            protocolMarshaller.marshall(product.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(product.getCompanyName(), COMPANYNAME_BINDING);
            protocolMarshaller.marshall(product.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(product.getCategories(), CATEGORIES_BINDING);
            protocolMarshaller.marshall(product.getIntegrationTypes(), INTEGRATIONTYPES_BINDING);
            protocolMarshaller.marshall(product.getMarketplaceUrl(), MARKETPLACEURL_BINDING);
            protocolMarshaller.marshall(product.getActivationUrl(), ACTIVATIONURL_BINDING);
            protocolMarshaller.marshall(product.getProductSubscriptionResourcePolicy(), PRODUCTSUBSCRIPTIONRESOURCEPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
