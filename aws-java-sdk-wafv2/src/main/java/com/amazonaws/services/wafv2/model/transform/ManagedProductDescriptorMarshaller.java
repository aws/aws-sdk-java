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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManagedProductDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManagedProductDescriptorMarshaller {

    private static final MarshallingInfo<String> VENDORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VendorName").build();
    private static final MarshallingInfo<String> MANAGEDRULESETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedRuleSetName").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PRODUCTLINK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductLink").build();
    private static final MarshallingInfo<String> PRODUCTTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductTitle").build();
    private static final MarshallingInfo<String> PRODUCTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductDescription").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<Boolean> ISVERSIONINGSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsVersioningSupported").build();
    private static final MarshallingInfo<Boolean> ISADVANCEDMANAGEDRULESET_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsAdvancedManagedRuleSet").build();

    private static final ManagedProductDescriptorMarshaller instance = new ManagedProductDescriptorMarshaller();

    public static ManagedProductDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManagedProductDescriptor managedProductDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (managedProductDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(managedProductDescriptor.getVendorName(), VENDORNAME_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getManagedRuleSetName(), MANAGEDRULESETNAME_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getProductLink(), PRODUCTLINK_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getProductTitle(), PRODUCTTITLE_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getProductDescription(), PRODUCTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getIsVersioningSupported(), ISVERSIONINGSUPPORTED_BINDING);
            protocolMarshaller.marshall(managedProductDescriptor.getIsAdvancedManagedRuleSet(), ISADVANCEDMANAGEDRULESET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
