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
 * LicenseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseMarshaller {

    private static final MarshallingInfo<String> LICENSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseArn").build();
    private static final MarshallingInfo<String> LICENSENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseName").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<String> PRODUCTSKU_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductSKU").build();
    private static final MarshallingInfo<StructuredPojo> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Issuer").build();
    private static final MarshallingInfo<String> HOMEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeRegion").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Validity").build();
    private static final MarshallingInfo<String> BENEFICIARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Beneficiary").build();
    private static final MarshallingInfo<List> ENTITLEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Entitlements").build();
    private static final MarshallingInfo<StructuredPojo> CONSUMPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumptionConfiguration").build();
    private static final MarshallingInfo<List> LICENSEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseMetadata").build();
    private static final MarshallingInfo<String> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

    private static final LicenseMarshaller instance = new LicenseMarshaller();

    public static LicenseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(License license, ProtocolMarshaller protocolMarshaller) {

        if (license == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(license.getLicenseArn(), LICENSEARN_BINDING);
            protocolMarshaller.marshall(license.getLicenseName(), LICENSENAME_BINDING);
            protocolMarshaller.marshall(license.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(license.getProductSKU(), PRODUCTSKU_BINDING);
            protocolMarshaller.marshall(license.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(license.getHomeRegion(), HOMEREGION_BINDING);
            protocolMarshaller.marshall(license.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(license.getValidity(), VALIDITY_BINDING);
            protocolMarshaller.marshall(license.getBeneficiary(), BENEFICIARY_BINDING);
            protocolMarshaller.marshall(license.getEntitlements(), ENTITLEMENTS_BINDING);
            protocolMarshaller.marshall(license.getConsumptionConfiguration(), CONSUMPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(license.getLicenseMetadata(), LICENSEMETADATA_BINDING);
            protocolMarshaller.marshall(license.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(license.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
