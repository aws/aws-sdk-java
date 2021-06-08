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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingProviderFieldsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingProviderFieldsMarshaller {

    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Confidence").build();
    private static final MarshallingInfo<Integer> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Criticality").build();
    private static final MarshallingInfo<List> RELATEDFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindings").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Severity").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Types").build();

    private static final FindingProviderFieldsMarshaller instance = new FindingProviderFieldsMarshaller();

    public static FindingProviderFieldsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingProviderFields findingProviderFields, ProtocolMarshaller protocolMarshaller) {

        if (findingProviderFields == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingProviderFields.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(findingProviderFields.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(findingProviderFields.getRelatedFindings(), RELATEDFINDINGS_BINDING);
            protocolMarshaller.marshall(findingProviderFields.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(findingProviderFields.getTypes(), TYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
