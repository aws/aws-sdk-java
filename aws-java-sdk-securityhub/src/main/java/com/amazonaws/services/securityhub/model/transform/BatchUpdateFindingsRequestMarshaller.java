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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchUpdateFindingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchUpdateFindingsRequestMarshaller {

    private static final MarshallingInfo<List> FINDINGIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindingIdentifiers").build();
    private static final MarshallingInfo<StructuredPojo> NOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Note").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationState").build();
    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Confidence").build();
    private static final MarshallingInfo<Integer> CRITICALITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Criticality").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Types").build();
    private static final MarshallingInfo<Map> USERDEFINEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserDefinedFields").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Workflow").build();
    private static final MarshallingInfo<List> RELATEDFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedFindings").build();

    private static final BatchUpdateFindingsRequestMarshaller instance = new BatchUpdateFindingsRequestMarshaller();

    public static BatchUpdateFindingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchUpdateFindingsRequest batchUpdateFindingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchUpdateFindingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getFindingIdentifiers(), FINDINGIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getNote(), NOTE_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getCriticality(), CRITICALITY_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getTypes(), TYPES_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getUserDefinedFields(), USERDEFINEDFIELDS_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getWorkflow(), WORKFLOW_BINDING);
            protocolMarshaller.marshall(batchUpdateFindingsRequest.getRelatedFindings(), RELATEDFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
