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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> CISADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cisaData").build();
    private static final MarshallingInfo<List> CWES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cwes").build();
    private static final MarshallingInfo<Double> EPSSSCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("epssScore").build();
    private static final MarshallingInfo<List> EVIDENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("evidences").build();
    private static final MarshallingInfo<StructuredPojo> EXPLOITOBSERVED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exploitObserved").build();
    private static final MarshallingInfo<String> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArn").build();
    private static final MarshallingInfo<List> REFERENCEURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("referenceUrls").build();
    private static final MarshallingInfo<Integer> RISKSCORE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("riskScore").build();
    private static final MarshallingInfo<List> TOOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tools").build();
    private static final MarshallingInfo<List> TTPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ttps").build();

    private static final FindingDetailMarshaller instance = new FindingDetailMarshaller();

    public static FindingDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingDetail findingDetail, ProtocolMarshaller protocolMarshaller) {

        if (findingDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingDetail.getCisaData(), CISADATA_BINDING);
            protocolMarshaller.marshall(findingDetail.getCwes(), CWES_BINDING);
            protocolMarshaller.marshall(findingDetail.getEpssScore(), EPSSSCORE_BINDING);
            protocolMarshaller.marshall(findingDetail.getEvidences(), EVIDENCES_BINDING);
            protocolMarshaller.marshall(findingDetail.getExploitObserved(), EXPLOITOBSERVED_BINDING);
            protocolMarshaller.marshall(findingDetail.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(findingDetail.getReferenceUrls(), REFERENCEURLS_BINDING);
            protocolMarshaller.marshall(findingDetail.getRiskScore(), RISKSCORE_BINDING);
            protocolMarshaller.marshall(findingDetail.getTools(), TOOLS_BINDING);
            protocolMarshaller.marshall(findingDetail.getTtps(), TTPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
