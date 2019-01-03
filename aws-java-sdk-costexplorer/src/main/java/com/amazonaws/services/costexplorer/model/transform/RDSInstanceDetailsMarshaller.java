/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RDSInstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RDSInstanceDetailsMarshaller {

    private static final MarshallingInfo<String> FAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Family").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> DATABASEENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseEngine").build();
    private static final MarshallingInfo<String> DATABASEEDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseEdition").build();
    private static final MarshallingInfo<String> DEPLOYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentOption").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseModel").build();
    private static final MarshallingInfo<Boolean> CURRENTGENERATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentGeneration").build();
    private static final MarshallingInfo<Boolean> SIZEFLEXELIGIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeFlexEligible").build();

    private static final RDSInstanceDetailsMarshaller instance = new RDSInstanceDetailsMarshaller();

    public static RDSInstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RDSInstanceDetails rDSInstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (rDSInstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rDSInstanceDetails.getFamily(), FAMILY_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getDatabaseEngine(), DATABASEENGINE_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getDatabaseEdition(), DATABASEEDITION_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getDeploymentOption(), DEPLOYMENTOPTION_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getCurrentGeneration(), CURRENTGENERATION_BINDING);
            protocolMarshaller.marshall(rDSInstanceDetails.getSizeFlexEligible(), SIZEFLEXELIGIBLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
