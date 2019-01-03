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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClassifierMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClassifierMetadataMarshaller {

    private static final MarshallingInfo<Integer> NUMBEROFLABELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfLabels").build();
    private static final MarshallingInfo<Integer> NUMBEROFTRAINEDDOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfTrainedDocuments").build();
    private static final MarshallingInfo<Integer> NUMBEROFTESTDOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfTestDocuments").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationMetrics").build();

    private static final ClassifierMetadataMarshaller instance = new ClassifierMetadataMarshaller();

    public static ClassifierMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClassifierMetadata classifierMetadata, ProtocolMarshaller protocolMarshaller) {

        if (classifierMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(classifierMetadata.getNumberOfLabels(), NUMBEROFLABELS_BINDING);
            protocolMarshaller.marshall(classifierMetadata.getNumberOfTrainedDocuments(), NUMBEROFTRAINEDDOCUMENTS_BINDING);
            protocolMarshaller.marshall(classifierMetadata.getNumberOfTestDocuments(), NUMBEROFTESTDOCUMENTS_BINDING);
            protocolMarshaller.marshall(classifierMetadata.getEvaluationMetrics(), EVALUATIONMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
