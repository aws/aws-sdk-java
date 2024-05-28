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
package com.amazonaws.services.tnb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.tnb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListSolNetworkPackageInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSolNetworkPackageInfoMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadata").build();
    private static final MarshallingInfo<String> NSDDESIGNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdDesigner").build();
    private static final MarshallingInfo<String> NSDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nsdId").build();
    private static final MarshallingInfo<String> NSDINVARIANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdInvariantId").build();
    private static final MarshallingInfo<String> NSDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nsdName").build();
    private static final MarshallingInfo<String> NSDONBOARDINGSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdOnboardingState").build();
    private static final MarshallingInfo<String> NSDOPERATIONALSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdOperationalState").build();
    private static final MarshallingInfo<String> NSDUSAGESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdUsageState").build();
    private static final MarshallingInfo<String> NSDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nsdVersion").build();
    private static final MarshallingInfo<List> VNFPKGIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vnfPkgIds").build();

    private static final ListSolNetworkPackageInfoMarshaller instance = new ListSolNetworkPackageInfoMarshaller();

    public static ListSolNetworkPackageInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSolNetworkPackageInfo listSolNetworkPackageInfo, ProtocolMarshaller protocolMarshaller) {

        if (listSolNetworkPackageInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getId(), ID_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdDesigner(), NSDDESIGNER_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdId(), NSDID_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdInvariantId(), NSDINVARIANTID_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdName(), NSDNAME_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdOnboardingState(), NSDONBOARDINGSTATE_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdOperationalState(), NSDOPERATIONALSTATE_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdUsageState(), NSDUSAGESTATE_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getNsdVersion(), NSDVERSION_BINDING);
            protocolMarshaller.marshall(listSolNetworkPackageInfo.getVnfPkgIds(), VNFPKGIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
