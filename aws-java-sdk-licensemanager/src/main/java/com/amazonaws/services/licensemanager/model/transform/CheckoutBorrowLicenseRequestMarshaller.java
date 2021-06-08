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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CheckoutBorrowLicenseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckoutBorrowLicenseRequestMarshaller {

    private static final MarshallingInfo<String> LICENSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseArn").build();
    private static final MarshallingInfo<List> ENTITLEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Entitlements").build();
    private static final MarshallingInfo<String> DIGITALSIGNATUREMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DigitalSignatureMethod").build();
    private static final MarshallingInfo<String> NODEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeId").build();
    private static final MarshallingInfo<List> CHECKOUTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckoutMetadata").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();

    private static final CheckoutBorrowLicenseRequestMarshaller instance = new CheckoutBorrowLicenseRequestMarshaller();

    public static CheckoutBorrowLicenseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckoutBorrowLicenseRequest checkoutBorrowLicenseRequest, ProtocolMarshaller protocolMarshaller) {

        if (checkoutBorrowLicenseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getLicenseArn(), LICENSEARN_BINDING);
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getEntitlements(), ENTITLEMENTS_BINDING);
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getDigitalSignatureMethod(), DIGITALSIGNATUREMETHOD_BINDING);
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getNodeId(), NODEID_BINDING);
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getCheckoutMetadata(), CHECKOUTMETADATA_BINDING);
            protocolMarshaller.marshall(checkoutBorrowLicenseRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
