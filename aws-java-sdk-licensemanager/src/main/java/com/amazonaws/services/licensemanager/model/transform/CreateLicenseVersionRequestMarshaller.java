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
 * CreateLicenseVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLicenseVersionRequestMarshaller {

    private static final MarshallingInfo<String> LICENSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseArn").build();
    private static final MarshallingInfo<String> LICENSENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseName").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<StructuredPojo> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Issuer").build();
    private static final MarshallingInfo<String> HOMEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeRegion").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Validity").build();
    private static final MarshallingInfo<List> LICENSEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseMetadata").build();
    private static final MarshallingInfo<List> ENTITLEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Entitlements").build();
    private static final MarshallingInfo<StructuredPojo> CONSUMPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumptionConfiguration").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> SOURCEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceVersion").build();

    private static final CreateLicenseVersionRequestMarshaller instance = new CreateLicenseVersionRequestMarshaller();

    public static CreateLicenseVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLicenseVersionRequest createLicenseVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLicenseVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLicenseVersionRequest.getLicenseArn(), LICENSEARN_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getLicenseName(), LICENSENAME_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getHomeRegion(), HOMEREGION_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getValidity(), VALIDITY_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getLicenseMetadata(), LICENSEMETADATA_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getEntitlements(), ENTITLEMENTS_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getConsumptionConfiguration(), CONSUMPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createLicenseVersionRequest.getSourceVersion(), SOURCEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
