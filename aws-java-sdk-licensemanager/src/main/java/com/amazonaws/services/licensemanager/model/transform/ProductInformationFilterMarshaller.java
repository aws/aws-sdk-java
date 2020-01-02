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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProductInformationFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductInformationFilterMarshaller {

    private static final MarshallingInfo<String> PRODUCTINFORMATIONFILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductInformationFilterName").build();
    private static final MarshallingInfo<List> PRODUCTINFORMATIONFILTERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductInformationFilterValue").build();
    private static final MarshallingInfo<String> PRODUCTINFORMATIONFILTERCOMPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductInformationFilterComparator").build();

    private static final ProductInformationFilterMarshaller instance = new ProductInformationFilterMarshaller();

    public static ProductInformationFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProductInformationFilter productInformationFilter, ProtocolMarshaller protocolMarshaller) {

        if (productInformationFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(productInformationFilter.getProductInformationFilterName(), PRODUCTINFORMATIONFILTERNAME_BINDING);
            protocolMarshaller.marshall(productInformationFilter.getProductInformationFilterValue(), PRODUCTINFORMATIONFILTERVALUE_BINDING);
            protocolMarshaller.marshall(productInformationFilter.getProductInformationFilterComparator(), PRODUCTINFORMATIONFILTERCOMPARATOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
