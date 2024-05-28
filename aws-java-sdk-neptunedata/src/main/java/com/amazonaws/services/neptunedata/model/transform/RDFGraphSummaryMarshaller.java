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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RDFGraphSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RDFGraphSummaryMarshaller {

    private static final MarshallingInfo<Long> NUMDISTINCTSUBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numDistinctSubjects").build();
    private static final MarshallingInfo<Long> NUMDISTINCTPREDICATES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numDistinctPredicates").build();
    private static final MarshallingInfo<Long> NUMQUADS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numQuads").build();
    private static final MarshallingInfo<Long> NUMCLASSES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numClasses").build();
    private static final MarshallingInfo<List> CLASSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("classes").build();
    private static final MarshallingInfo<List> PREDICATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("predicates").build();
    private static final MarshallingInfo<List> SUBJECTSTRUCTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subjectStructures").build();

    private static final RDFGraphSummaryMarshaller instance = new RDFGraphSummaryMarshaller();

    public static RDFGraphSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RDFGraphSummary rDFGraphSummary, ProtocolMarshaller protocolMarshaller) {

        if (rDFGraphSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rDFGraphSummary.getNumDistinctSubjects(), NUMDISTINCTSUBJECTS_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getNumDistinctPredicates(), NUMDISTINCTPREDICATES_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getNumQuads(), NUMQUADS_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getNumClasses(), NUMCLASSES_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getClasses(), CLASSES_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getPredicates(), PREDICATES_BINDING);
            protocolMarshaller.marshall(rDFGraphSummary.getSubjectStructures(), SUBJECTSTRUCTURES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
